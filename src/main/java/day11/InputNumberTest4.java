package com.study.day11;

import java.util.Scanner;

public class InputNumberTest4 {
	
	public static void main(String[] args) {
		try {
			inputNumber();
		} catch (Exception e) {
			System.out.println("有錯誤發生 !");
			e.printStackTrace(System.out);
			System.out.println("請重新執行");
			main(null); // 重新執行主程式
		}
	}
	
	// 輸入
	public static void inputNumber() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入數字：");
		int x = sc.nextInt();
		System.out.printf("x = %d\n", x);
	}
	
}
