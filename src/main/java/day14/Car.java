package com.study.day14;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Car implements Runnable {
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s 從台北出發\n", threadName);
		try {
			Thread.sleep(new Random().nextInt(10_000));
			System.out.printf("%s 到台中了\n", threadName);
			//cyclicBarrier.await(); // 等待其他人
			cyclicBarrier.await(10, TimeUnit.SECONDS); // 等待其他人(最多等10秒)
		} catch (Exception e) {
			System.out.printf("%s 不等了自行離開\n", threadName);
		}
		System.out.printf("%s 到高雄了\n", threadName);
	}
	
}
