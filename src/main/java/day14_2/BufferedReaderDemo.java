package com.study.day14_2;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		String source_path = "src/main/java/com/study/day14_2/files/hello.txt";
		try(FileReader fr = new FileReader(source_path);
			BufferedReader br = new BufferedReader(fr);) {
			
			String data;
			while ((data = br.readLine()) != null) { // 逐行讀取
				System.out.println(data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
