<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Bootstrap</title>
<%@ include file="/commons/jsp/bHead.jsp"%>
</head>
<body>
	<br /> id:${userId }
	<br /> 用户名:${requestScope.username }
	<br /> 密码:${requestScope.password }
	<br /> 年龄:${age }
	<br /> 性别:${gender }
	<br /> 生日:${birthday }
	<br /> model:${requestScope.user }11
	<br /> model:${requestScope.model }22
	<s:debug></s:debug>
</body>

</html>