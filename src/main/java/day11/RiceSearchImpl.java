package com.study.day11;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class RiceSearchImpl implements RiceSearch {
	private Rice[] rices;
	private static final String PATH = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
	private Gson gson = new Gson();
	
	private String getContent() {
		String content = null;
		try {
			URL url = new URL(PATH);
			content = new Scanner(url.openStream()).useDelimiter("\\A").next();
		} catch (IOException e) {
			System.out.println("資料無法取得：" + e);
		}
		return content;
	}
	
	@Override
	public Rice[] getRices() {
		String content = getContent();
		if(content == null) { // 沒有資料
			return null;
		}
		rices = gson.fromJson(content, Rice[].class);
		return rices;
	}

	@Override
	public Rice[] getRices(String keyword) {
		Arrays.stream(rices) // 轉串流（目的：進行分析）
			.filter(rice -> rice.品名.contains(keyword)) // filter 過濾
			.collect(Collectors.toList()) // 收集為一個集合
			.toArray(rices); // 將集合轉陣列
		return rices;
	}

	@Override
	public int getRowCount() {
		if(rices == null) {
			return 0;
		}
		return rices.length;
	}
}
