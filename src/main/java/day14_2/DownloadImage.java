package com.study.day14_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;

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
	
	public static void main(String[] args) throws Exception {
		// 取得 imageUrl
		String imageUrl = getImageUrl();
		System.out.println("imageUrl: " + imageUrl);
		// 下載後資料存放地點
		String dest_path = "src/main/java/com/study/day14_2/files/car.jpg";
		// xxxRead 讀取文字資料 char[]
		// xxxInputStream 讀取非文字資料 byte[]
		URL url = new URL(imageUrl);
		try(InputStream is = url.openStream();
			FileOutputStream fos = new FileOutputStream(dest_path)) {
			byte[] buffer = new byte[1];
			while (is.read(buffer) != -1) {
				fos.write(buffer);
			}
			System.out.println("下載並存檔完畢");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
