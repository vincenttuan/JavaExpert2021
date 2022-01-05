package com.study.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberTest6 {
	// 大原則：RuntimeException的例外不一定要使用 try-catch 來進行錯誤處理
	public static void main(String[] args) {
		int num = 10;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分母：");
		
		try {
			int de = sc.nextInt();
			if(de != 0) { // 判斷分母是否 = 0, 就可以少寫一個 catch(ArithmeticException e)
				int result = num / de;
				System.out.printf("%d / %d = %d\n", num, de, result);
			} else {
				System.out.println("分母不可 = 0");
			}
		} catch (InputMismatchException e) {
			System.out.println("輸入錯誤");
		}
		
		
	}

}
