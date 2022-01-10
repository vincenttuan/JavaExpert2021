package com.study.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/*
需求：印出所有員工資料
SQL查詢語句：select id, name, salary, dept_id from Employee
結果顯示：
+----+--------+----------+---------+ 
| id |  name  |  salary  | dept_id |
+----+--------+----------+---------+ 
|  1 |  John  |  45000.0 |       1 |
+----+--------+----------+---------+  
|  2 |  Mary  |  38000.0 |       1 |
+----+--------+----------+---------+  
|  3 |  Bobo  |  55000.0 |       2 |
+----+--------+----------+---------+  
|  4 |  Jane  |  32000.0 |       1 |
+----+--------+----------+---------+  
|  5 |  Helen |  76000.0 |       2 |
+----+--------+----------+---------+  
*/
public class SqliteQueryEmployee {
	public static void main(String[] args) throws Exception {
		// 1. sqlite 驅動物件註冊
		Class.forName("org.sqlite.JDBC");
		// 2. 建立連線物件
		Connection conn = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
		System.out.println("連線是否關閉:" + conn.isClosed());
		// 3. 建立 Statement (SQL 敘述物件)
		String sql = "select id, name, salary, dept_id from Employee";
		Statement stmt = conn.createStatement();
		// 4. 將 sql 的查詢結果放入 ResultSet (結果集合)
		ResultSet rs = stmt.executeQuery(sql);
		// 4.1 補充：取得資料表的欄位名稱 -------------------------------
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.printf("欄位數量：%d\n", rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.printf("欄位名稱：%s\n", rsmd.getColumnName(i));
		}
		// ----------------------------------------------------------
		// 5. 瀏覽/輪詢 ResultSet
		System.out.println("+----+--------+----------+---------+");
		System.out.println("| id |  name  |  salary  | dept_id |");
		System.out.println("+----+--------+----------+---------+");
		while (rs.next()) {
			Integer emp_id = rs.getInt("id");
			String emp_name = rs.getString("name");
			Double emp_salary = rs.getDouble("salary");
			Integer dept_id = rs.getInt("dept_id");
			System.out.printf("|%4d|%-8s|%10.1f|%9d|\n", emp_id, emp_name, emp_salary, dept_id);
			System.out.println("+----+--------+----------+---------+");
		}
		// 6. 關閉連線
		conn.close();
	}
}
