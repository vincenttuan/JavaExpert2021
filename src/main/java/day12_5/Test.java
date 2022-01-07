package com.study.day12_5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 1. 透過執行緒物件取得一個價格漲跌幅百分比值 Ex: 0.25
		// 2. 取到之後將該數值 * 100 Ex: 0.25 * 100 = 25
		// 3. 印出 25%
		
		PriceChange priceChange = new PriceChange();
		// 建立 FutureTask
		FutureTask<Double> task = new FutureTask<Double>(priceChange);
		// 透過執行緒執行 task
		new Thread(task).start();
		double data = task.get();
		double value = data * 100;
		System.out.printf("%.4f %.1f %%\n", data, value);
	}

}
