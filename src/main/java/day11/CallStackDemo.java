package com.study.day11;

public class CallStackDemo {

	public static void main(String[] args) {
		int de = 0;
		a(de);
	}
	
	public static void a(int de) {
		try {
			b(de);
		} catch (ArithmeticException e) {
			System.err.println("a處理數學錯誤");
		}
	}
	
	public static void b(int de) {
		c(de);
	}
	
	public static void c(int de) {
		int result = 100 / de;
		System.out.println(result);
	}

}
