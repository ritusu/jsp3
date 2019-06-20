package com.lti.training.empllyeesearch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;

@WebServlet("/empsearch")
public class EmployeeServlet extends HttpServlet {
       
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 	//	PrintWriter out = response.getWriter();
 		
 		EmployeeDao dao = new EmployeeDao();
 		
 		int empno = Integer.parseInt(request.getParameter("empid"));
 		
 		try {
 			
 				Employee employee = dao.fetch(empno);
 		
 				HttpSession session = request.getSession();
		
 				session.setAttribute("getallempdetails", employee);
		
		
 				response.sendRedirect("employeesearch.jsp");
 		
 		
 			}
 		catch(Exception e) {
 			e.printStackTrace();
 		}		
 	}
}