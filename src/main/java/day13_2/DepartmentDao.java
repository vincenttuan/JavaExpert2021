package com.study.day13_2;

import java.util.List;
import java.util.Map;

// CRUD - Create / Read / Update / Delete
public interface DepartmentDao {
	// 查詢全部
	List<Map<String, Object>> readAll();
	// 查詢單筆 - 根據 id
	Map<String, Object> readById(Integer id);
	// 新增部門資料
	int create(String name);
	// 修改部門名稱
	int update(Integer id, String updateName);
	// 刪除部門 - 根據 id
	int delete(Integer delete_id);
	
}
