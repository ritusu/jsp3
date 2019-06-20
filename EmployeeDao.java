package com.lti.training.empllyeesearch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class EmployeeDao {
	
	public Employee fetch(int empno) {
		Employee emp = new Employee();
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establish connection with the Database
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="select * from emp where empno=?";
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1, empno);
			
			rs = stmt.executeQuery();
			
			
		
			//Employee emp= new Employee();
			rs.next();
				
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setMgr(rs.getInt(4));
			emp.setHiredate(rs.getString(5));
			emp.setSal(rs.getDouble(6));
			emp.setComm(rs.getDouble(7));
			emp.setDeptno(rs.getInt(8));
			
			
			
			
			
		}
		catch (ClassNotFoundException e) {
			System.out.println("JDBC driver not found");
			//throw new DataAccessException("Unable to load the JDBC");
			
		}
		catch(SQLException e) {
				
				e.printStackTrace();
			//throw new DataAccessException("Problem while fetching Products from DataBase",e);
		}
		finally {
			try { conn.close(); } catch(Exception e) {  }
			return emp;
			}
		
		}
	}
