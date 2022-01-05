package com.study.day11;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RiceSystem {

	private static boolean stop;
	private static RiceSearch riceSearch;

	public static void main(String[] args) {
		// Game loop
		while (!stop) {
			riceSearch = new RiceSearchImpl();
			riceSearch.getRices();
			menu();
		}
	}

	public static void menu() {
		System.out.println("---------------");
		System.out.println("資料總筆數：" + riceSearch.getRowCount());
		System.out.println("1. 請輸入關鍵字");
		System.out.println("0. 離開 Exit");
		System.out.println("---------------");
		input();
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("請選擇：");
		try {
			switch (sc.nextInt()) {
			case 1:
				sc = new Scanner(System.in);
				System.out.print("請輸入品名關鍵字：");
				String keyword = sc.next();
				List<Rice> rices = riceSearch.getRices(keyword);
				print(rices);
				break;
			case 0:
				System.out.println("離開系統");
				stop = true;
			}
		} catch (InputMismatchException e) {
			System.out.println("輸入錯誤，請重新輸入：" + e);
		}

	}

	public static void print(List<Rice> rices) {
		if(rices == null || rices.size() == 0) {
			System.out.println("查無資料");
			return;
		}
		for (Rice rice : rices) {
			if (rice != null) {
				System.out.printf("品名：%s 不合格原因：%s\n", rice.品名.trim(), rice.不合格原因.trim());
			}
		}
	}
}
