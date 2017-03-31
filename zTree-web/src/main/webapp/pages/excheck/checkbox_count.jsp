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
    <title>Checkbox 勾选统计</title>
</head>
<body>
<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
    <div class="right">
        <ul class="info">
            <li>当前被勾选的节点共 <span id="checkCount" class="highlight_red"></span> 个</li>
            <li>当前未被勾选的节点共 <span id="nocheckCount" class="highlight_red"></span> 个</li>
            <li>勾选状态对比规则：<input type="radio" id="init" name="stateType" class="radio first" checked /><span>与 zTree 初始化时对比</span><br/>
                <input type="radio" id="last" name="stateType" class="radio first" style="margin-left:108px;"/><span>与上一次勾选后对比</span></li>
            <li>当前被修改勾选状态的节点共 <span id="changeCount" class="highlight_red"></span> 个</li>
        </ul>
    </div>
</div>
<%@include file="../../common/common.jsp" %>
<input type="hidden" id="ctx" value="${ctx}"/>
<script src="${ctx}/js/excheck/checkbox_count.js" type="text/javascript"></script>
</body>
</html>
