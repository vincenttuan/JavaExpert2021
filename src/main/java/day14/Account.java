package com.study.day14;

// 帳戶
public class Account {
	// 現金餘額
	private int balance;
	// 設定帳戶餘額-建構子封裝
	public Account(int balance) {
		this.balance = balance;
	}
	// getter 與 setter 封裝
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// 提款功能 withdraw(提款金額)
	public synchronized void withdraw(int amount) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s 開始提款\n", threadName);
		// 開始提款
		// 取得目前最新帳戶餘額
		int currentBalance = getBalance();
		// 模擬可能會花費的時間 ...
		for(int i=0;i<100_0000;i++);
		//-----------------------------
		// 判斷是否有足夠的餘額可以提款 ?
		if(currentBalance >= amount) {
			// 減去提款的金額
			currentBalance = currentBalance - amount;
			// 回存到餘額
			setBalance(currentBalance);
			// 印出交易清單
			System.out.printf("%s 提款：$%,d 成功，餘額：$%,d\n", threadName, amount, getBalance());
		} else {
			System.out.printf("%s 提款：$%,d 失敗，餘額：$%,d\n", threadName, amount, getBalance());
		}
		System.out.printf("%s 結束提款\n", threadName);
	}
	
}


