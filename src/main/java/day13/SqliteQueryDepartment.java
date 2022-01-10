package com.study.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqliteQueryDepartment {
	public static void main(String[] args) throws Exception {
		// 1. sqlite 驅動物件註冊
		Class.forName("org.sqlite.JDBC");
		// 2. 建立連線物件
		Connection conn = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
		System.out.println("連線是否關閉:" + conn.isClosed());
		// 3. 建立 Statement (SQL 敘述物件)
		String sql = "select id, name from Department";
		Statement stmt = conn.createStatement();
		// 4. 將 sql 的查詢結果放入 ResultSet (結果集合)
		ResultSet rs = stmt.executeQuery(sql);
		// 5. 瀏覽/輪詢 ResultSet
		System.out.println("+----+--------+");
		System.out.println("| id |  name  |");
		System.out.println("+----+--------+");
		while (rs.next()) {
			Integer dept_id = rs.getInt("id");
			String dept_name = rs.getString("name");
			System.out.printf("|%4d|%-8s|\n", dept_id, dept_name);
			System.out.println("+----+--------+");
		}
		// 6. 關閉連線
		conn.close();
	}
}
