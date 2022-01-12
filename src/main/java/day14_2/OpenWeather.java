package com.study.day14_2;

import java.io.FileWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OpenWeather {
	public static String getJsonString(String city) throws Exception {
		String code = "8d1e6f10632315abbb1c2a2d796b7f0c";
		String urlstr = "https://api.openweathermap.org/data/2.5/weather?q=%s,tw&appid=%s";
		urlstr = String.format(urlstr, city, code);
		System.out.println(urlstr);
		URL url = new URL(urlstr);
		String jsonstr = new Scanner(url.openStream()).useDelimiter("\\A").next();
		//System.out.println(jsonstr);
		return jsonstr;
	}
	
	public static void main(String[] args) throws Exception {
		String jsonstr = getJsonString("taoyuan");
		System.out.println(jsonstr);
		JsonElement je = JsonParser.parseString(jsonstr);
		JsonObject root = je.getAsJsonObject();
		Integer dt = root.get("dt").getAsInt();
		String name = root.get("name").getAsString();
		String main = root.getAsJsonArray("weather").get(0).getAsJsonObject().get("main").getAsString();
		String description = root.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString();
		Double temp = root.getAsJsonObject("main").get("temp").getAsDouble();
		Double feels_like = root.getAsJsonObject("main").get("feels_like").getAsDouble();
		Integer humidity = root.getAsJsonObject("main").get("humidity").getAsInt();
		
		// 時間轉換
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dt_str = sdf.format(new Date((long)dt*1000));
		System.out.printf("時間：%d(%s)\n地區：%s\n天氣：%s\n天氣描述：%s\n氣溫：%.2f°C\n體感：%.2f°C\n濕度：%d%%\n",
						  dt, dt_str, name, main, description, temp, feels_like, humidity);
		// 將資料存入
		String dest_path = "src/main/java/com/study/day14_2/files/weather.txt";
		String data = String.format("時間：%d(%s)\n地區：%s\n天氣：%s\n天氣描述：%s\n氣溫：%.2f°C\n體感：%.2f°C\n濕度：%d%%\n",
						  dt, dt_str, name, main, description, temp, feels_like, humidity);
		
		try(FileWriter fw = new FileWriter(dest_path)) {
			fw.append(data);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
