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
    <title>用 zTree 方法 更新 节点数据</title>
</head>
<body>
<div class="zTreeDemoBackground left">
    <ul id="treeDemo" class="ztree"></ul>
</div>
<div class="right">
    <ul class="info">
        <li><a id="rename" href="#" onclick="return false;">换名字</a></li>
        <li><a id="changeIcon" href="#" onclick="return false;">换图标</a></li>
        <li><a id="changeColor" href="#" onclick="return false;">换颜色</a></li>
        <li><a id="changeFont" href="#" onclick="return false;">斜体</a></li>
    </ul>
</div>
<%@include file="../../common/common.jsp" %>
<input type="hidden" id="ctx" value="${ctx}" />
<script src="${ctx}/js/core/update_fun.js" type="text/javascript"></script>
</body>
</html>
