package com.study.day13_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		Map<String, Object> map = null;
		String sql = "select id, name from Department where id = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				map = new LinkedHashMap<>();
				map.put("id", rs.getInt("id"));
				map.put("name", rs.getString("name"));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return map;
	}

	@Override
	public int create(String name) {
		int rowcount = 0; // 異動筆數
		String sql = "Insert into Department(name) values(?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
		}
		return rowcount;
	}

	@Override
	public int update(Integer id, String updateName) {
		int rowcount = 0;
		String sql = "Update Department set name=? where id=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, updateName);
			pstmt.setInt(2, id);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
		}
		return rowcount;
	}

	@Override
	public int delete(Integer delete_id) {
		int rowcount = 0;
		String sql = "Delete from Department where id=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, delete_id);
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
		}
		return rowcount;
	}

}
