package com.study.day14_2;

import java.io.File;

public class CreateNewFile {
	public static void main(String[] args) {
		String path = "src/main/java/com/study/day14_2/files";
		File folder = new File(path);
		System.out.println("絕對路徑：" + folder.getAbsolutePath());
		// 建立資料夾
		if (!folder.exists()) {
			boolean success = folder.mkdir();
			System.out.println("建立目錄：" + success);
		} else {
			System.out.println("目錄已存在");
		}
		// 建立檔案
		String file_name = "hello.txt";
		String file_path = path + File.separator + file_name;
		System.out.println("檔案位置：" + file_path);
		File file = new File(file_path);
		if(!file.exists()) {
			try {
				boolean success = file.createNewFile();
				System.out.println("建立檔案：" + success);
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("檔案已存在");
		}
	}
}
