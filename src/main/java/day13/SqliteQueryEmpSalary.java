package com.study.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
SQL語法 :
select 'sum' as salary_type, sum(e.salary) as salary, '' as emp_name, '' as dept_name
from Employee e
UNION ALL
select 'avg' as salary_type, avg(e.salary) as salary, '' as emp_name, '' as dept_name
from Employee e
UNION ALL
select 'max' as salary_type, max(e.salary) as salary, e.name as emp_name, d.name as dept_name
from Employee e 
left join Department d on e.dept_id = d.id
UNION ALL
select 'min' as salary_type, min(e.salary) as salary, e.name as emp_name, d.name as dept_name
from Employee e 
left join Department d on e.dept_id = d.id

1. 員工全部薪資 = 237,000
2. 員工平均薪資 =  47,400
3. 最高薪資：IT 部門 Helen $67,000
4. 最低薪資：Sales 部門 Jane $32,000
*/
public class SqliteQueryEmpSalary {

	public static void main(String[] args) throws Exception {
		// 1. sqlite 驅動物件註冊
		Class.forName("org.sqlite.JDBC");
		// 2. 建立連線物件
		Connection conn = DriverManager.getConnection("jdbc:sqlite:db/demo.db");
		System.out.println("連線是否關閉:" + conn.isClosed());
		// 3. 建立 Statement (SQL 敘述物件)
		String sql = "select 'sum' as salary_type, sum(e.salary) as salary, '' as emp_name, '' as dept_name\n"
				+ "from Employee e\n"
				+ "UNION ALL\n"
				+ "select 'avg' as salary_type, avg(e.salary) as salary, '' as emp_name, '' as dept_name\n"
				+ "from Employee e\n"
				+ "UNION ALL\n"
				+ "select 'max' as salary_type, max(e.salary) as salary, e.name as emp_name, d.name as dept_name\n"
				+ "from Employee e \n"
				+ "left join Department d on e.dept_id = d.id\n"
				+ "UNION ALL\n"
				+ "select 'min' as salary_type, min(e.salary) as salary, e.name as emp_name, d.name as dept_name\n"
				+ "from Employee e \n"
				+ "left join Department d on e.dept_id = d.id";
		Statement stmt = conn.createStatement();
		// 4. 將 sql 的查詢結果放入 ResultSet (結果集合)
		ResultSet rs = stmt.executeQuery(sql);

		// ----------------------------------------------------------
		// 5. 瀏覽/輪詢 ResultSet
		/*
		1. 員工全部薪資 = 237,000
		2. 員工平均薪資 =  47,400
		3. 最高薪資：IT 部門 Helen $67,000
		4. 最低薪資：Sales 部門 Jane $32,000
		*/
		while (rs.next()) {
			String salary_type = rs.getString("salary_type");
			switch (salary_type) {
				case "sum":
					System.out.printf("員工全部薪資 = %,.1f\n", rs.getDouble("salary"));
					break;
				case "avg":
					System.out.printf("員工平均薪資 = %,.1f\n", rs.getDouble("salary"));
					break;
				case "max":
					System.out.printf("最高薪資：%s 部門 %s $%,.1f\n", 
							rs.getString("dept_name"), rs.getString("emp_name"), rs.getDouble("salary"));
					break;
				case "min":
					System.out.printf("最低薪資：%s 部門 %s $%,.1f\n", 
							rs.getString("dept_name"), rs.getString("emp_name"), rs.getDouble("salary"));
					break;	
			}
		}
		
		// 6. 關閉連線
		conn.close();

	}
	
}
