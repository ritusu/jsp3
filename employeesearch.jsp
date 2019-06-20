
<%@page import="com.lti.training.empllyeesearch.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		Employee emp= (Employee)session.getAttribute("getallempdetails");
%>
		EmployeeName:<%= emp.getEname()%><br/>
		Job:<%= emp.getJob() %><br/>
		mgr:<%= emp.getMgr() %><br/>
		HiredDate:<%= emp.getHiredate() %><br/>
		salary:<%= emp.getSal() %><br/>
		commission:<%= emp.getComm() %><br/>
		Department Number:<%= emp.getDeptno() %><br/>
		=============================<br/>


</body>
</html>