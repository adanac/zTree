/**
 * Created by allen on 2017/3/21.
 */
var $ctx = $("#ctx").val();
var setting = {
    view: {
        selectedMulti: false
    },
    check: {
        enable: true
    },
    data: {
        simpleData: {
            enable: true
        }
    },
    callback: {
        beforeCheck: beforeCheck,
        onCheck: onCheck
    }
};

var zNodes =[
    { id:1, pId:0, name:"随意勾选 1", open:true},
    { id:11, pId:1, name:"随意勾选 1-1"},
    { id:12, pId:1, name:"随意勾选 1-2", open:true},
    { id:121, pId:12, name:"随意勾选 1-2-1"},
    { id:122, pId:12, name:"随意勾选 1-2-2"},
    { id:2, pId:0, name:"禁止勾选 2", open:true, doCheck:false},
    { id:21, pId:2, name:"禁止勾选 2-1", doCheck:false},
    { id:22, pId:2, name:"禁止勾选 2-2", checked:true, open:true, doCheck:false},
    { id:221, pId:22, name:"禁止勾选 2-2-1", doCheck:false},
    { id:222, pId:22, name:"禁止勾选 2-2-2", checked:true, doCheck:false},
    { id:23, pId:2, name:"禁止勾选 2-3", doCheck:false}
];

var code, log, className = "dark";
function beforeCheck(treeId, treeNode) {
    className = (className === "dark" ? "":"dark");
    showLog("[ "+getTime()+" beforeCheck ]&nbsp;&nbsp;&nbsp;&nbsp;" + treeNode.name );
    return (treeNode.doCheck !== false);
}
function onCheck(e, treeId, treeNode) {
    showLog("[ "+getTime()+" onCheck ]&nbsp;&nbsp;&nbsp;&nbsp;" + treeNode.name );
}
function showLog(str) {
    if (!log) log = $("#log");
    log.append("<li class='"+className+"'>"+str+"</li>");
    if(log.children("li").length > 6) {
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

function checkNode(e) {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
        type = e.data.type,
        nodes = zTree.getSelectedNodes();
    if (type.indexOf("All")<0 && nodes.length == 0) {
        alert("请先选择一个节点");
    }

    if (type == "checkAllTrue") {
        zTree.checkAllNodes(true);
    } else if (type == "checkAllFalse") {
        zTree.checkAllNodes(false);
    } else {
        var callbackFlag = $("#callbackTrigger").attr("checked");
        for (var i=0, l=nodes.length; i<l; i++) {
            if (type == "checkTrue") {
                zTree.checkNode(nodes[i], true, false, callbackFlag);
            } else if (type == "checkFalse") {
                zTree.checkNode(nodes[i], false, false, callbackFlag);
            } else if (type == "toggle") {
                zTree.checkNode(nodes[i], null, false, callbackFlag);
            }else if (type == "checkTruePS") {
                zTree.checkNode(nodes[i], true, true, callbackFlag);
            } else if (type == "checkFalsePS") {
                zTree.checkNode(nodes[i], false, true, callbackFlag);
            } else if (type == "togglePS") {
                zTree.checkNode(nodes[i], null, true, callbackFlag);
            }
        }
    }
}

function setAutoTrigger(e) {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo");
    zTree.setting.check.autoCheckTrigger = $("#autoCallbackTrigger").attr("checked");
    $("#autoCheckTriggerValue").html(zTree.setting.check.autoCheckTrigger ? "true" : "false");
}

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    $("#checkTrue").bind("click", {type:"checkTrue"}, checkNode);
    $("#checkFalse").bind("click", {type:"checkFalse"}, checkNode);
    $("#toggle").bind("click", {type:"toggle"}, checkNode);
    $("#checkTruePS").bind("click", {type:"checkTruePS"}, checkNode);
    $("#checkFalsePS").bind("click", {type:"checkFalsePS"}, checkNode);
    $("#togglePS").bind("click", {type:"togglePS"}, checkNode);
    $("#checkAllTrue").bind("click", {type:"checkAllTrue"}, checkNode);
    $("#checkAllFalse").bind("click", {type:"checkAllFalse"}, checkNode);

    $("#autoCallbackTrigger").bind("change", {}, setAutoTrigger);
});