package com.study.day12_2;

public class Typist implements Employee { // 打字員
	@Override
	public void job() {
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 打字 %d\n", threadName, i);
		}
	}
}
