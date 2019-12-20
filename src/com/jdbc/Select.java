package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "123456");
		//通过连接对象获取语句对象
		Statement yuju=conn.createStatement();
		//定义sql语句
		String sql="select * from tb_user";
		//执行
		ResultSet rs =yuju.executeQuery(sql);
		System.out.println("id | name 	| sex "+"	   |  email 		 | birthday");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			String email=rs.getString("email");
			String birthday=rs.getString("birthday");
			System.out.println(id+"  | "+name+"  	| "+sex+"	   | "+email+" 	 | "+birthday);
		}
		

	}

}
