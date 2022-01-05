package com.study.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberTest1 {

	public static void main(String[] args) {
		System.out.print("請輸入半徑：");
		Scanner sc = new Scanner(System.in);
		int r = 0;
		try {
			r = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("輸入錯誤：" + e);
		}
		double area = Math.pow(r, 2) * Math.PI;
		System.out.printf("半徑：%d 圓面積：%.1f\n", r, area);

	}

}
