package com.study.day12_3;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		Computer pc = new Computer();
		
		Thread t1 = new Thread(car, "汽車");
		Thread t2 = new Thread(pc, "電腦");
		
		t1.setPriority(Thread.MAX_PRIORITY); // 10
		t2.setPriority(Thread.MIN_PRIORITY); // 1
		
		t1.start();
		t2.start();
		
	}
}
