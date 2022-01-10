package com.study.day13_2;

import java.util.List;
import java.util.Map;

public class TestRead {

	public static void main(String[] args) {
		DepartmentDao dao = new DepartmentDaoImpl();
		// 查詢全部
		List<Map<String, Object>> list = dao.readAll();
		System.out.println(list);
		// 查詢單筆
		Map<String, Object> m1 = dao.readById(1);
		System.out.println(m1);
		Map<String, Object> m2 = dao.readById(2);
		System.out.println(m2);
		Map<String, Object> m3 = dao.readById(3);
		System.out.println(m3);
	}

}
