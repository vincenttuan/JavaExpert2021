package com.study.day12;

public class RaceSystem {
	public static void main(String[] args) {
		Race r1 = new Rabbit("兔子", 1000);
		Race r2 = new Tortoise("烏龜", 1000);
		
		//r1.job();
		//r2.job();
		
		r1.start();
		r2.start();
	}
}
