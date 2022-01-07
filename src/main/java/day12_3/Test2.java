package com.study.day12_3;

/*
主執行緒 main 
會等待 使用者(UI) thread 工作完成才會結束
不會等待 背景 thread 工作完成
*/
public class Test2 {

	public static void main(String[] args) {
		Game game = new Game();
		Music music = new Music();
		
		Thread t1 = new Thread(game, "快打炫風"); // user thread
		Thread t2 = new Thread(music, "快打"); // user thread
		t2.setDaemon(true); // 設定為背景執行緒
		
		t1.start();
		t2.start();

	}

}
