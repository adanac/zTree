<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String basePath = request.getContextPath();
    String realPath = request.getServletContext().getRealPath("/");//项目绝对路径E:\adanac_demo\zTree\zTree-web\target\zTree-web\
    String path1 = realPath.substring(0, realPath.lastIndexOf("\\"));
    String manualPath = "/" + path1.substring(path1.lastIndexOf("\\") + 1, path1.length());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>ztree</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="<%=basePath %>/zTreedemo/css/demo.css" type="text/css">
    <link rel="stylesheet" href="<%=basePath %>/zTreedemo/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="<%=basePath %>/zTreedemo/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>/zTreedemo/js/jquery.ztree.core-3.5.js"></script>
    <script type="text/javascript" src="<%=basePath %>/zTreedemo/js/jquery.ztree.excheck-3.5.js"></script>
</head>

<body>
<%@include file="/common/common-empty.jsp" %>
<input type="text" id="ctx" value="<%=basePath%>">
<div class="zTreeDemoBackground left">
    <ul id="treeDemo" class="ztree"></ul>
</div>
<script type="text/javascript" src="../js/demo1.js"></script>
</body>
</html>
