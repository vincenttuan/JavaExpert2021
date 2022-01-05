package com.study.day11;

public class InputNumberTest5 {
	
	public static void main(String[] args) {
		try {
			div1(10, 0);
		} catch (Exception e) {
			System.out.println("數學錯誤 div1：" + e.getMessage());
		}
		
		try {
			div2(10, 0);
		} catch (Exception e) {
			System.out.println("數學錯誤 div2：" + e.getMessage());
		}
	}
	
	// 除法計算 1
	public static void div1(int num, int de) throws Exception {
		int result = num / de;
		System.out.println(result);
	}
	
	// 除法計算 2
	public static void div2(int num, int de) throws Exception {
		// 先確認分母是否為 0
		if(de == 0) {
			// 自行創造一個錯誤物件 e
			Exception e = new Exception("分母不可=0");
			// 將錯誤物件 e 拋出
			throw e;
		}
		int result = num / de;
		System.out.println(result);
	}
	
}
