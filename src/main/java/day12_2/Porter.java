package com.study.day12_2;

public class Porter implements Employee { // 搬運工
	@Override
	public void job() {
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 搬運 %d\n", threadName, i);
		}
	}
}