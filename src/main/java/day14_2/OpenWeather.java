package com.study.day14_2;

import java.net.URL;
import java.util.Scanner;

public class OpenWeather {
	public static void main(String[] args) throws Exception {
		String code = "8d1e6f10632315abbb1c2a2d796b7f0c";
		String city = "taoyuan";
		String urlstr = "https://api.openweathermap.org/data/2.5/weather?q=%s,tw&appid=%s";
		urlstr = String.format(urlstr, city, code);
		System.out.println(urlstr);
		URL url = new URL(urlstr);
		String jsonstr = new Scanner(url.openStream()).useDelimiter("\\A").next();
		System.out.println(jsonstr);
	}
}
