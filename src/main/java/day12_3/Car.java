package com.study.day12_3;

public class Car implements Runnable {
	private void drive() { // 駕駛
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑了 %d 公里\n", threadName, i);
		}
	}
	@Override
	public void run() {
		drive();
	}
}
