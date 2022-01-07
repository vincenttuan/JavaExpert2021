package com.study.day12_4;

public class Father implements Runnable {

	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗熱水澡");
		System.out.println("爸爸發現沒瓦斯了");
		System.out.println("爸爸打電話請工人送瓦斯");
		// -- 建立工人執行緒 ------------------
		Worker worker = new Worker();
		Thread t = new Thread(worker, "工人");
		t.start();
		// 爸爸要等待工人
		try {
			t.join(10_000); // 最多可以等待 10 秒
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		// ----------------------------------
		System.out.println("爸爸開始洗熱水澡");
		System.out.println("爸爸洗完澡了!");
	}

}
