package com.study.day14_2;

import java.io.FileReader;

public class ReadDataFromFile {
	public static void main(String[] args) {
		String file_path = "src/main/java/com/study/day14_2/files/hello.txt";
		
		try(FileReader fr = new FileReader(file_path)) {
			
			char[] buffer = new char[1];
			while (fr.read(buffer) != -1) { // -1 表示資料讀取完畢
				String s = new String(buffer); // 將 char[] 轉 String
				System.out.print(s);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
