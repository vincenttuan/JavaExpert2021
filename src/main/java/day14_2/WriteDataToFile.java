package com.study.day14_2;

import java.io.FileWriter;
import java.util.Date;

public class WriteDataToFile {
	public static void main(String[] args) {
		String file_path = "src/main/java/com/study/day14_2/files/hello.txt";
		boolean append = true;
		try(FileWriter fw = new FileWriter(file_path, append)) {
			
			fw.write("Hello " + new Date() + "\n");
			
			System.out.println("寫檔完畢");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
