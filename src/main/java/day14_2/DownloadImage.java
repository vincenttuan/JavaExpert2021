package com.study.day14_2;

import java.io.FileReader;

public class DownloadImage {
	public static String getImageUrl() {
		String path = "src/main/java/com/study/day14_2/files/path.txt";
		String imageUrl = "";
		try(FileReader fr = new FileReader(path)) {
			char[] buffer = new char[1];
			while (fr.read(buffer) != -1) {
				imageUrl += new String(buffer);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return imageUrl.trim();
	}
	
	public static void main(String[] args) {
		// 取得 imageUrl
		String imageUrl = getImageUrl();
		System.out.println("imageUrl: " + imageUrl);
	}
}
