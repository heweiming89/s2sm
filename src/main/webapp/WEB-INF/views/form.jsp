<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Form</title>
<%@ include file="/commons/jsp/bHead.jsp"%>
<c:set var="ctxPath" value="${pageContext.request.contextPath }" />
</head>
<body>
	<form action="${ctxPath }/common2" method="get">
		id: <input type="text" name="userId" id="" /> <br />
		用户名:<input type="text" name="username" id="" /> <br />
		密码:<input type="text" name="password" id="" /> <br />
		年龄:<input type="text" name="age" id="" /> <br />
		性别:<input type="text" name="gender" id="" /> <br />
		生日:<input type="text" name="birthday" id="" /> <br />
		<input type="submit" value="提交表单" />
	</form>

</body>
</html>