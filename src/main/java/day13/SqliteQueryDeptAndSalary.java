package com.study.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*----------------------------------------------------------------------------------
Department 與 Salary 進行群組 group by 查詢 SQL：
------------------------------------------------------------------------------------
select d.name as dept_name, sum(e.salary) as salary_sum, avg(e.salary) as salary_avg
from Department d, Employee e
where d.id = e.dept_id
group by d.name
------------------------------------------------------------------------------------
輸出結果：
+-----------+-------------+-------------+
| dept_name |salary_sum($)|salary_avg($)|
+-----------+-------------+-------------+
| IT        |    122,000.0|     61,000.0|
+-----------+-------------+-------------+
| Sales     |     61,000.0|     38,333.3|
+-----------+-------------+-------------+

----------------------------------------------------------------------------------*/
public class SqliteQueryDeptAndSalary {
	public static void main(String[] args) throws Exception {
		// 1. sqlite 驅動物件註冊
		Class.forName("org.sqlite.JDBC");
		// 2. 建立連線物件
		Connection conn = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
		System.out.println("連線是否關閉:" + conn.isClosed());
		// 3. 建立 Statement (SQL 敘述物件)
		String sql =  "select d.name as dept_name, sum(e.salary) as salary_sum, avg(e.salary) as salary_avg "
					+ "from Department d, Employee e "
					+ "where d.id = e.dept_id "
					+ "group by d.name";
		Statement stmt = conn.createStatement();
		// 4. 將 sql 的查詢結果放入 ResultSet (結果集合)
		ResultSet rs = stmt.executeQuery(sql);

		// ----------------------------------------------------------
		// 5. 瀏覽/輪詢 ResultSet
		System.out.println("+-----------+-------------+-------------+");
		System.out.println("| dept_name |salary_sum($)|salary_avg($)|");
		System.out.println("+-----------+-------------+-------------+");
		while (rs.next()) {
			String dept_name = rs.getString("dept_name");
			Double salary_sum = rs.getDouble("salary_sum");
			Double salary_avg = rs.getDouble("salary_avg");
			System.out.printf("|%-11s|%,13.1f|%,13.1f|\n", dept_name, salary_sum, salary_avg);
			System.out.println("+-----------+-------------+-------------+");
		}
		// 6. 關閉連線
		conn.close();

	}	
}
