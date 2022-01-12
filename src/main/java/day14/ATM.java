package com.study.day14;

public class ATM {
	public static void main(String[] args) {
		// 建立帳戶並存入 $10,000 元
		Account account = new Account(10000);
		System.out.printf("最新帳戶餘額：$%,d\n", account.getBalance());
		
		// 建立提款工作
		Withdraw w1 = new Withdraw(account, 5000);
		Withdraw w2 = new Withdraw(account, 2000);
		Withdraw w3 = new Withdraw(account, 4000);
		
		// 建立「執行緒」去執行「提款工作」
		Thread t1 = new Thread(w1, "小明");
		Thread t2 = new Thread(w2, "小華");
		Thread t3 = new Thread(w3, "小英");
		
		// 開始執行
		t1.start();
		t2.start();
		t3.start();
		
	}
}
