package com.study.day12_5;

import java.util.concurrent.Callable;

public class PriceChange implements Callable<Double> {

	@Override
	public Double call() throws Exception {
		double change = Math.random();
		return change;
	}

}
