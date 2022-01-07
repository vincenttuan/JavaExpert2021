package com.study.day12_6;

public class MapUtils {
	private static double rad(double d) {
		return d * Math.PI / 180.00; // 角度轉換成弧度
	}

	/*
	 * 根據經緯度計算兩點之間的距離（單位米）
	 */
	public static double algorithm(double longitude1, double latitude1, double longitude2, double latitude2) {

		double Lat1 = rad(latitude1); // 緯度

		double Lat2 = rad(latitude2);

		double a = Lat1 - Lat2;// 兩點緯度之差

		double b = rad(longitude1) - rad(longitude2); // 經度之差

		double s = 2 * Math.asin(Math

				.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(Lat1) * Math.cos(Lat2) * Math.pow(Math.sin(b / 2), 2)));// 計算兩點距離的公式

		s = s * 6378137.0;// 弧長乘地球半徑（半徑為米）

		s = Math.round(s * 10000d) / 10000d;// 精確距離的數值
		// 四捨五入 保留一位小數
		//DecimalFormat df = new DecimalFormat("#.0");

		return s;

	}
}

