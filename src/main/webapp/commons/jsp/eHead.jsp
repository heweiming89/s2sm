<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="UTF-8">
<c:set var="ctxPath" value="${pageContext.request.contextPath }" />
<c:set var="commonPath" value="${ctxPath }/commons" />
<c:set var="resourcePath" value="${ctxPath }/resources" />
<c:set var="stylePath" value="${commonPath }/style" />
<link rel="shortcut icon" href="${stylePath }/images/Bootstrap.png">
<link rel="stylesheet" type="text/css"
	href="${resourcePath }/easyui/themes/metro-blue/easyui.css">
<link rel="stylesheet" type="text/css" href="${resourcePath }/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${resourcePath }/easyui/themes/color.css">
<link rel="stylesheet" type="text/css" href="${resourcePath }/easyui/demo/demo.css">
<script type="text/javascript" src="${resourcePath }/jquery/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="${resourcePath }/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${resourcePath }/easyui/datagrid-detailview.js"></script>
<script type="text/javascript" src="${resourcePath }/easyui/locale/easyui-lang-zh_CN.js"></script>
