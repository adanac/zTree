<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/3/16
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>core-customIcon</title>
</head>
<body>
<div class="zTreeDemoBackground left">
    <ul id="treeDemo" class="ztree"></ul>
</div>
<%@include file="../../common/common.jsp" %>
<input type="hidden" id="ctx" value="${ctx}" />
<script src="${ctx}/js/core/custom_icon.js" type="text/javascript"></script>
</body>
</html>
