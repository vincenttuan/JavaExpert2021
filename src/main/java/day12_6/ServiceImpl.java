package com.study.day12_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.FutureTask;
import static java.util.stream.Collectors.toList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ServiceImpl implements Service {
	
	private List<Youbike> youbikes = new ArrayList<>();
	
	// 更新最新 youbikes 資料
	@Override
	public void updateYoubikes() {
		WebCrawler webCrawler = new WebCrawler();
		FutureTask<String> task = new FutureTask<>(webCrawler);
		new Thread(task).start();
		String jsonstr = null;
		try {
			jsonstr = task.get();
		} catch (Exception e) {
			System.out.println(e);
		}
		if(jsonstr == null) {
			return;
		}
		// 將 jsonstr 轉為 List<Youbike>
		// 1. 將字串 jsonstr 轉為可分析的 JsonElement 物件
		JsonElement je = JsonParser.parseString(jsonstr);
		// 2. 取得根物件 root -> result -> records
		JsonObject root = je.getAsJsonObject();
		JsonObject result = root.getAsJsonObject("result");
		JsonArray records = result.getAsJsonArray("records");
		//System.out.println(records);
		// 3. 將 records 轉成靜態陣列 Youbike[]
		Youbike[] youbikeArray = new Gson().fromJson(records, Youbike[].class);
		// 4. 透過 Arrays.asList 將靜態陣列轉為動態陣列
		youbikes = Arrays.asList(youbikeArray);
		//System.out.println(youbikes);
		//System.out.println(youbikes.size());
	}
	
	@Override
	public List<Youbike> queryYoubikes() {
		return youbikes;
	}

	@Override
	public List<Youbike> queryYoubikes(String snaKeyword) {
		return youbikes.stream()
				.filter(youbike -> youbike.sna.contains(snaKeyword))
				.collect(toList());
	}

	@Override
	public List<Youbike> queryByGatherThenSbi(Integer amount) {
		return youbikes.stream()
				.filter(youbike -> youbike.sbi >= amount)
				.collect(toList());
	}

	@Override
	public List<Youbike> queryByGatherThenBemp(Integer amount) {
		return youbikes.stream()
				.filter(youbike -> youbike.bemp >= amount)
				.collect(toList());
	}
	
	@Override
	public void print(List<Youbike> youbikes) {
		for(Youbike youbike : youbikes) {
			System.out.printf("%s 可借：%d 可還：%d\n", 
							youbike.sna, youbike.sbi, youbike.bemp);
		}
	}

	@Override
	public List<Youbike> queryByDistance(Double my_lat, Double my_lng, Double m) {
		return youbikes.stream()
				.filter(youbike -> {
					double d = MapUtils.algorithm(my_lng, my_lat, youbike.lng, youbike.lat);
					return d <= m;
				})
				.collect(toList());
	}
	
	
}
