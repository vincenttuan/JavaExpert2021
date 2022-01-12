package com.study.day14;

public class Withdraw implements Runnable {
	private Account account;
	private int amount;
	
	public Withdraw(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		// 進行帳戶提款
		account.withdraw(amount);
	}

}
