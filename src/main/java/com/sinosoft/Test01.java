package com.sinosoft;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01 {

	public static void main(String[] args){
		Connection conn;
		Statement stmt;
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		try {
			//加载驱动
			Class.forName(driver);
			// 获取连接
			  conn=DriverManager.getConnection(url,user,password);
			   stmt = conn.createStatement();
			  String sql="select * from charge_bank";
			  ResultSet rs= stmt.executeQuery(sql);
			  while(rs.next()) {
				 String store = rs.getString("store");
				 System.out.println(store);
				 
			  }
			  stmt.close();
				conn.close();
			  
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		
			
		}
	}

}
