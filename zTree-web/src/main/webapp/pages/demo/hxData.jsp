<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>ztree 回显数据</title>
</head>
<body>

<%@include file="../../common/common.jsp" %>
<input type="hidden" id="ctx" value="${ctx}"/>
<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
</div>
<script src="${ctx}/js/demo/hxData.js" type="text/javascript"></script>
</body>
</html>