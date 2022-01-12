package com.study.day14_2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		String dest_path = "src/main/java/com/study/day14_2/files/news.txt";
		String[] news = {"news 1", "news 2"};
		
		try(FileWriter fw = new FileWriter(dest_path, true);
			BufferedWriter bw = new BufferedWriter(fw);) {
			
			for(String data : news) {
				bw.write(data);
				bw.newLine(); // 寫入換行符號 \n
			}
			System.out.println("寫入完成");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
