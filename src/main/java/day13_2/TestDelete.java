package com.study.day13_2;

public class TestDelete {

	public static void main(String[] args) {
		DepartmentDao dao = new DepartmentDaoImpl();
		int rowcount = dao.delete(3);
		System.out.printf("刪除異動筆數：%d\n", rowcount);

	}

}
