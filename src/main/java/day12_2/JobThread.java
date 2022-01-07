package com.study.day12_2;

public class JobThread extends Thread {
	private Employee employee;
	
	public JobThread(Employee employee, String name) {
		super(name);
		this.employee = employee;
	}

	@Override
	public void run() {
		employee.job();
	}
}
