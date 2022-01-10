package com.study.day13_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DepartmentDaoImpl implements DepartmentDao {
	
	private Connection conn = SqliteUtils.getConnection();
	
	@Override
	public List<Map<String, Object>> readAll() {
		List<Map<String, Object>> list = new ArrayList<>();
		String sql = "select id, name from Department";
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				// 將每一筆紀錄放到 map 集合物件中
				Map<String, Object> map = new LinkedHashMap<>();
				map.put("id", rs.getInt("id"));
				map.put("name", rs.getString("name"));
				list.add(map); // 加入到 list 集合中
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return list;
	}

	@Override
	public Map<String, Object> readById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Integer id, String updateName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer delete_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
