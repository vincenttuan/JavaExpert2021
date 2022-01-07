package com.study.day12_3;

public class Game implements Runnable {

	@Override
	public void run() {
		System.out.println("遊戲開始");
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 遊戲進行中... %d\n", threadName, i);
		}
		System.out.println("遊戲結束");
	}
	
}
