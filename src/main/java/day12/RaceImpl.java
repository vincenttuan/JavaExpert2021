package com.study.day12;

public abstract class RaceImpl extends Thread implements Race {
	private int count;
	private String name;
	
	public RaceImpl(String name, int count) {
		super(name); // 設定執行緒名字 I
		//super.setName(name); // 設定執行緒名字 II
		this.name = name;
		this.count = count;
	}
	
	@Override
	public void run() {
		job();
	}

	@Override
	public void job() {
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=count;i++) {
			System.out.printf("%s 跑了 %d 步\n", threadName, i);
		}
	}
}
