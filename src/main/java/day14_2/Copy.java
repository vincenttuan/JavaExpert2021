package com.study.day14_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Copy {
	// 指定哪一個檔案要複製到哪個檔案 ?
	// Ex: files\hello.txt 複製到 files\hello_copy.txt
	public static void main(String[] args) {
		String source_path = "src/main/java/com/study/day14_2/files/hello.txt";
		String dest_path = "src/main/java/com/study/day14_2/files/hello_copy.txt";
		// 判斷 dest 是否存在？若存在則先刪除
		File dest = new File(dest_path);
		if(dest.exists()) {
			dest.delete();
			System.out.println(dest + "已刪除");
		}
		// copy 一邊讀一邊寫入
		try(FileReader fr = new FileReader(source_path);
			FileWriter fw = new FileWriter(dest_path, true);) {
			
			char[] buffer = new char[1];
			while (fr.read(buffer) != -1) { // 邊讀
				fw.write(buffer); // 邊寫
			}
			
			System.out.println("Copy 完成");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
