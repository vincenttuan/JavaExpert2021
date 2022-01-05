package com.study.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberTest3 {
	public static void main(String[] args) {
		int num = 30; // 分子
		int[] dens = {10, 0, 5}; // 分母陣列
		System.out.print("請選擇分母 index [0, 1, 2]：");
		
		try {
			
			Scanner sc = new Scanner(System.in);
			int index = sc.nextInt();
			int de = dens[index];
			int result = num / de;
			System.out.printf("%d / %d = %d\n", num, de, result);	
			
		} catch (ArithmeticException e) {
			System.err.println("數學錯誤：" + e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("輸入錯誤：");
		} finally {
			System.out.println("謝謝使用");
		}
		
	}
}
