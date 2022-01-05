package com.study.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberTest7 {
	// 大原則：RuntimeException的例外不一定要使用 try-catch 來進行錯誤處理
	public static void main(String[] args) {
		int num = 10;
		int[] dens = {5, 2, 0};
		int index = 0;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入 index [0, 1, 2]：");
			index = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("輸入錯誤");
			return;
		}
		
		// 驗證 index 是否超過 dens 的長度-1
		if(index > dens.length-1) {
			System.out.println("index 超過範圍");
			return;
		}
		int de = dens[index];
		// 驗證 de 是否 == 0
		if(de == 0) {
			System.out.println("分母不可 == 0");
			return;
		}
		
		int result = num / de;
		
		System.out.printf("%d / %d = %d\n", num, de, result);
	}
}
