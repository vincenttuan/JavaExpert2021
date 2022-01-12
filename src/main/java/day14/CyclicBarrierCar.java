package com.study.day14;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCar {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("吃中飯");
		};
		
		int n = 3;
		CyclicBarrier cb = new CyclicBarrier(n, r);
		
		Thread t1 = new Thread(new Car(cb), "A");
		Thread t2 = new Thread(new Car(cb), "B");
		Thread t3 = new Thread(new Car(cb), "C");
		Thread t4 = new Thread(new Car(cb), "D");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
