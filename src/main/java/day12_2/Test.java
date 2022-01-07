package com.study.day12_2;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Porter();
		Employee e2 = new Typist();
		
		Thread t1 = new JobThread(e1, "小明");
		Thread t2 = new JobThread(e2, "小英");
		
		t1.start();
		t2.start();
	}
}
