<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/3/16
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@include file="common-empty.jsp"%>
<%
    response.setHeader("Pragma","No-Cache");
    response.setDateHeader("Expires", 0);
    response.setHeader("Cache-Control","no-Cache");
%>
<link href="${ctx}/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css" rel="stylesheet">
<script src="${ctx}/common/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="${ctx}/ztree/js/jquery.ztree.core.js" type="text/javascript"></script>
<script src="${ctx}/ztree/js/jquery.ztree.excheck.js" type="text/javascript"></script>
<script src="${ctx}/ztree/js/jquery.ztree.exedit.js" type="text/javascript"></script>