package com.study.day12_6;

import java.util.concurrent.FutureTask;

public class Test {
	public static void main(String[] args) throws Exception {
		WebCrawler webCrawler = new WebCrawler();
		FutureTask<String> task = new FutureTask<>(webCrawler);
		new Thread(task).start();
		String jsonstr = task.get();
		System.out.println(jsonstr);
	}
}
