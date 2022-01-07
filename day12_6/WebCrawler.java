package com.study.day12_6;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class WebCrawler implements Callable<String> {
	private String path = "https://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json&limit=400";
	
	@Override
	public String call() throws Exception {
		URL url = new URL(path);
		Scanner sc = new Scanner(url.openStream()).useDelimiter("\\A");
		return sc.next();
	}
	
}
