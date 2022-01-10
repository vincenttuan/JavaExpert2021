package com.study.day13_2;

import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		DepartmentDao dao = new DepartmentDaoImpl();
		// 查詢全部
		List<Map<String, Object>> list = dao.readAll();
		System.out.println(list);
		
	}

}
