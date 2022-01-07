package com.study.day12_6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ServiceImpl implements Service {
	
	private List<Youbike> youbikes = new ArrayList<>();
	
	// 更新最新 youbikes 資料
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
		// 2. 取得根物件 root
		JsonObject root = je.getAsJsonObject();
		JsonObject result = root.getAsJsonObject("result");
		JsonArray records = result.getAsJsonArray("records");
		System.out.println(records);
	}
	
	@Override
	public List<Youbike> queryYoubikes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Youbike> queryYoubikes(String snaKeyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Youbike> queryByGatherThenSbi(Integer amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Youbike> queryByGatherThenBemp(Integer amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
