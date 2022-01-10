package com.study.day13_2;

public class TestCreate {

	public static void main(String[] args) {
		DepartmentDao dao = new DepartmentDaoImpl();
		int rowcount = dao.create("Account");
		System.out.printf("新增異動筆數：%d\n", rowcount);

	}

}
