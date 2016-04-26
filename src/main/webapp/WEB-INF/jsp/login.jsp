<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Struts 2 Hello World Example</h1>

	<s:form action="login" namespace="/HelloWorld" method="POST">
		<s:textfield name="userName" label="Username" />
		<s:password name="passWord" label="Password" />
		<s:submit key="login"/>
	</s:form>
	<div><%if(request.getAttribute("isInitial") == null){out.println("username uncompared with password! try again~");}; %></div>
</body>
</html>