package com.study.day11;

import java.util.List;

public interface RiceSearch {
	// 取得目前所有的 Rice 資料
	Rice[] getRices();	
	// 根據 keyword 取得  Rice 資料
	List<Rice> getRices(String keyword);
	// 目前 Rice[] 的筆數
	int getRowCount();
}
