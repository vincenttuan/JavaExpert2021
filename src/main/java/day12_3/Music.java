package com.study.day12_3;

public class Music implements Runnable {

	@Override
	public void run() {
		System.out.println("背景音樂開始");
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=2_000;i++) {
			System.out.printf("%s 背景音樂播放中... %d\n", threadName, i);
		}
		System.out.println("背景音樂結束");
	}
	
}
