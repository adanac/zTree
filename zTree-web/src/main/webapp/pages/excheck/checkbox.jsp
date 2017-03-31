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
    <title>Checkbox 勾选操作</title>
</head>
<body>
<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
    <div class="right">
        <ul class="info">
            <li><p>父子关联关系：<br/>
                被勾选时：<input type="checkbox" id="py" class="checkbox first" checked /><span>关联父</span>
                <input type="checkbox" id="sy" class="checkbox first" checked /><span>关联子</span><br/>
                取消勾选时：<input type="checkbox" id="pn" class="checkbox first" checked /><span>关联父</span>
                <input type="checkbox" id="sn" class="checkbox first" checked /><span>关联子</span><br/>
                <ul id="code" class="log" style="height:20px;"></ul></p>
            </li>
        </ul>
    </div>
</div>
<%@include file="../../common/common.jsp" %>
<input type="hidden" id="ctx" value="${ctx}"/>
<script src="${ctx}/js/excheck/checkbox.js" type="text/javascript"></script>
</body>
</html>
