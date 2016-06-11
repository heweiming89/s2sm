<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Bootstrap</title>
<%@ include file="/commons/jsp/bHead.jsp"%>
</head>
<body>
	id:${userId }
	<br /> 用户名:${requestScope.username }
	<br /> 密码:${password }
	<br /> 年龄:${age }
	<br /> 性别:${gender }
	<br /> 生日:${birthday }
	<br />
</body>

</html>