/**
 * Created by allen on 2017/3/16.
 */
var $ctx = $("#ctx").val();
console.log($ctx);
var setting = {
    view: {
        selectedMulti: false
    },
    async: {
        enable: true,
        url: $ctx +"/ztree/showData.do",
        autoParam:["id", "pId"],
        otherParam:{"otherParam":"zTreeAsyncTest"},
        dataFilter: filter
    },
    callback: {
        beforeClick: beforeClick,
        beforeAsync: beforeAsync,
        onAsyncError: onAsyncError,
        onAsyncSuccess: onAsyncSuccess
    }
};

function filter(treeId, parentNode, childNodes) {
    if (!childNodes) return null;
    for (var i=0, l=childNodes.length; i<l; i++) {
        childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
    }
    return childNodes;
}
function beforeClick(treeId, treeNode) {
    if (!treeNode.isParent) {
        alert("请选择父节点");
        return false;
    } else {
        return true;
    }
}
var log, className = "dark";
function beforeAsync(treeId, treeNode) {
    className = (className === "dark" ? "":"dark");
    showLog("[ "+getTime()+" beforeAsync ]&nbsp;&nbsp;&nbsp;&nbsp;" + ((!!treeNode && !!treeNode.name) ? treeNode.name : "root") );
    return true;
}
function onAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {
    showLog("[ "+getTime()+" onAsyncError ]&nbsp;&nbsp;&nbsp;&nbsp;" + ((!!treeNode && !!treeNode.name) ? treeNode.name : "root") );
}
function onAsyncSuccess(event, treeId, treeNode, msg) {
    showLog("[ "+getTime()+" onAsyncSuccess ]&nbsp;&nbsp;&nbsp;&nbsp;" + ((!!treeNode && !!treeNode.name) ? treeNode.name : "root") );
}

function showLog(str) {
    if (!log) log = $("#log");
    log.append("<li class='"+className+"'>"+str+"</li>");
    if(log.children("li").length > 8) {
        log.get(0).removeChild(log.children("li")[0]);
    }
}
function getTime() {
    var now= new Date(),
        h=now.getHours(),
        m=now.getMinutes(),
        s=now.getSeconds(),
        ms=now.getMilliseconds();
    return (h+":"+m+":"+s+ " " +ms);
}

function refreshNode(e) {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
        type = e.data.type,
        silent = e.data.silent,
        nodes = zTree.getSelectedNodes();
    if (nodes.length == 0) {
        alert("请先选择一个父节点");
    }
    for (var i=0, l=nodes.length; i<l; i++) {
        zTree.reAsyncChildNodes(nodes[i], type, silent);
        if (!silent) zTree.selectNode(nodes[i]);
    }
}

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting);
    $("#refreshNode").bind("click", {type:"refresh", silent:false}, refreshNode);
    $("#refreshNodeSilent").bind("click", {type:"refresh", silent:true}, refreshNode);
    $("#addNode").bind("click", {type:"add", silent:false}, refreshNode);
    $("#addNodeSilent").bind("click", {type:"add", silent:true}, refreshNode);
});
