package com.study.day13_2;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteUtils {
	private static Connection conn;
	static {
		try {
			// 1. sqlite 驅動物件註冊
			Class.forName("org.sqlite.JDBC");
			// 2. 建立連線物件
			conn = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	public static Connection getConnection() {
		return conn;
	}
}
