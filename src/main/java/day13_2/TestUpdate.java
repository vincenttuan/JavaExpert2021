package com.study.day13_2;

public class TestUpdate {

	public static void main(String[] args) {
		DepartmentDao dao = new DepartmentDaoImpl();
		int rowcount = dao.update(3, "Finance");
		System.out.printf("修改異動筆數：%d\n", rowcount);

	}

}
