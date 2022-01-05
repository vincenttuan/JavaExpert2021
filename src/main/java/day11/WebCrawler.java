package com.study.day11;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

public class WebCrawler {
	
	public static void main(String[] args) {
		String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
		String content = null;
		try {
			content = getData(path);
		} catch (IOException e) {
			System.out.println("資料抓取失敗：" + e);
		}
		//System.out.println(content);
		handleContent(content);
	}
	
	// 資料處理
	public static void handleContent(String content) {
		Gson gson = new Gson();
		Rice[] rices = gson.fromJson(content, Rice[].class);
		System.out.println("資料筆數：" + rices.length);
		//System.out.println("查看第一筆資料：" + rices[0]);
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入品名關鍵字（若輸入 exit 離開）：");
			String keyword = sc.next();
			if(keyword.equals("exit")) {
				System.out.println("離開...");
				break;
			}
			int i = 0;
			for(Rice rice : rices) {
				if(rice.品名.contains(keyword)) {
					System.out.printf("%d. 不合格品名：%s 不合格原因：%s\n", ++i, rice.品名, rice.不合格原因);
				}
			}
			System.out.printf("不合格筆數：%d\n", i);
		} while(true);
		
	}
	
	// 取得資料（網路爬蟲）
	public static String getData(String path) throws IOException {
		String content = null;
		URL url = new URL(path);
		Scanner sc = new Scanner(url.openStream()).useDelimiter("\\A");
		content = sc.next();
		return content;
	}
}
