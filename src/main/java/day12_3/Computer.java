package com.study.day12_3;

public class Computer implements Runnable {
	private void exec() { // 執行
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 執行 %d 秒\n", threadName, i);
		}
	}
	@Override
	public void run() {
		exec();
	}
}
