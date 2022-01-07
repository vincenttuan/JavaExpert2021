package com.study.day12_6;

public class Youbike {
	Integer _id; // 序號
	String sno;  // 站點代號
	String sna;  // 中文場站名稱
	Integer tot;  // 場站總停車格
	Integer sbi;  // 可借車位數
	Integer bemp; // 可還空位數
	Double lat;  // 緯度
	Double lng;  // 經度
	String ar;   // 中文地址
	String mday; // 資料更新時間
	
	@Override
	public String toString() {
		return "Youbike [_id=" + _id + ", sno=" + sno + ", sna=" + sna + ", tot=" + tot + ", sbi=" + sbi + ", bemp="
				+ bemp + ", lat=" + lat + ", lng=" + lng + ", ar=" + ar + ", mday=" + mday + "]";
	}
	
}
