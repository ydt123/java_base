package com.jdbc;


import java.sql.*;




public abstract class Test_conn {

	public static void main(String[] args) throws Exception {
		Connection conn=null;
		Statement yuju=null;
		ResultSet rs=null;
		try {
			//驱动（声明连接数据库的代码）
			Class.forName("com.mysql.jdbc.Driver");
			//连接（使用用户名、密码连接sql数据库）
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "123456");
			//通过连接对象获取语句对象
			yuju=conn.createStatement();
			//定义sql语句
			String sql="update tb_user set email='jack@qq.com' where id=1";
			//执行
			sql="select * from tb_user";
			//5.操作ResultSet结果集
			System.out.println("id | name  | sex "+"| email  | birthday");
			while (rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String sex=rs.getString("sex");
				String email=rs.getString("email");
				String birthday=rs.getString("birthday");
				System.out.println(id+" | "+name+" | "+sex+" | "+email+" | "+birthday);
			}
		}catch (Exception e){
			e.printStackTrace();
	}finally {
		//
		if(rs!=null) {rs.close();}
		if(yuju!=null) {yuju.close();}
		if(conn!=null) {conn.close();}
	}
		
	}
	
}
