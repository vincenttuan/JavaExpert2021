package com.study.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("請輸入身高：");
			double h = sc.nextDouble();
			System.out.print("請輸入體重：");
			double w = sc.nextDouble();
			// 計算 bmi
			double bmi = w / Math.pow(h/100, 2);
			System.out.printf("BMI：%.1f\n", bmi);
		} catch (InputMismatchException e) {
			System.err.println("輸入錯誤");
		} catch (Exception e) {
			System.err.println("其他錯誤");
		}

	}

}
