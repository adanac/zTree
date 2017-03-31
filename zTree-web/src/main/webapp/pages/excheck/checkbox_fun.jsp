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
    <title>Checkbox 勾选</title>
</head>
<body>
<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
</div>
<%@include file="../../common/common.jsp" %>
<input type="hidden" id="ctx" value="${ctx}"/>
<script src="${ctx}/js/excheck/checkbox_fun.js" type="text/javascript"></script>
</body>
</html>
