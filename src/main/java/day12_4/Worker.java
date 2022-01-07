package com.study.day12_4;

public class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println("工人接到通知");
		System.out.println("工人出發送瓦斯");
		for(int i=1;i<=5;i++) {
			try {
				System.out.printf("%d 秒鐘 ", i);
				Thread.sleep(1000); // 停一秒
			} catch (InterruptedException e) { // 中斷例外
				System.out.println("工人發生意外: " + e);
			}
		}
		System.out.println();
		System.out.println("工人將瓦斯送到家");
		System.out.println("工人把瓦斯裝好");
	}

}
