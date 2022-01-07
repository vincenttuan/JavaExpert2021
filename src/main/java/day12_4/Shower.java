package com.study.day12_4;

public class Shower {
	public static void main(String[] args) {
		
		Father father = new Father();
		Thread t = new Thread(father);
		t.start();
		
	}
}
