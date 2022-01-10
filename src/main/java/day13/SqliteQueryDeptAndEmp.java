package com.study.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*-------------------------------------------------------------
Department 與 Employee 交集查詢 SQL：
---------------------------------------------------------------
select d.id as dept_id, d.name as dept_name, e.name as emp_name
from Department d, Employee e
where d.id = e.dept_id
order by d.id
---------------------------------------------------------------
輸出結果：
+---------+-----------+----------+
| dept_id | dept_name | emp_name |
+---------+-----------+----------+
|        1|Sales      |John      |
+---------+-----------+----------+
|        2|Sales      |Mary      |
+---------+-----------+----------+
|        3|Sales      |Jane      |
+---------+-----------+----------+
|        4|IT         |Bobo      |
+---------+-----------+----------+
|        5|IT         |Helen     |
+---------+-----------+----------+

-------------------------------------------------------------*/
public class SqliteQueryDeptAndEmp {

	public static void main(String[] args) throws Exception {
		// 1. sqlite 驅動物件註冊
		Class.forName("org.sqlite.JDBC");
		// 2. 建立連線物件
		Connection conn = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
		System.out.println("連線是否關閉:" + conn.isClosed());
		// 3. 建立 Statement (SQL 敘述物件)
		String sql =  "select d.id as dept_id, d.name as dept_name, e.name as emp_name "
					+ "from Department d, Employee e "
					+ "where d.id = e.dept_id "
					+ "order by d.id";
		Statement stmt = conn.createStatement();
		// 4. 將 sql 的查詢結果放入 ResultSet (結果集合)
		ResultSet rs = stmt.executeQuery(sql);

		// ----------------------------------------------------------
		// 5. 瀏覽/輪詢 ResultSet
		System.out.println("+---------+-----------+----------+");
		System.out.println("| dept_id | dept_name | emp_name |");
		System.out.println("+---------+-----------+----------+");
		while (rs.next()) {
			Integer dept_id = rs.getInt("dept_id");
			String dept_name = rs.getString("dept_name");
			String emp_name = rs.getString("emp_name");
			System.out.printf("|%9d|%-11s|%-10s|\n", dept_id, dept_name, emp_name);
			System.out.println("+---------+-----------+----------+");
		}
		// 6. 關閉連線
		conn.close();

	}

}
