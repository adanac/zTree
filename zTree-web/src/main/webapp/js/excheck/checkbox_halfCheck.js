/**
 * Created by allen on 2017/3/21.
 */
var $ctx = $("#ctx").val();
var setting = {
    async: {
        enable: true,
        url:$ctx +"/ztree/showData3.do",
        autoParam:["id", "name=n", "level=lv"],
        otherParam:{"chk":"chk"},
        dataFilter: dataFilter
    },
    check: {
        enable: true,
        autoCheckTrigger: true
    },
    data: {
        simpleData: {
            enable: true
        }
    },
    callback: {
        onCheck: onCheck,
        onAsyncSuccess: onAsyncSuccess
    }
};

function dataFilter(treeId, parentNode, childNodes) {
    if (parentNode.checkedEx === true) {
        for(var i=0, l=childNodes.length; i<l; i++) {
            childNodes[i].checked = parentNode.checked;
            childNodes[i].halfCheck = false;
            childNodes[i].checkedEx = true;
        }
    }
    return childNodes;
}
function onCheck(event, treeId, treeNode) {
    cancelHalf(treeNode)
    treeNode.checkedEx = true;
}
function onAsyncSuccess(event, treeId, treeNode, msg) {
    cancelHalf(treeNode);
}
function cancelHalf(treeNode) {
    if (treeNode.checkedEx) return;
    var zTree = $.fn.zTree.getZTreeObj("treeDemo");
    treeNode.halfCheck = false;
    zTree.updateNode(treeNode);
}

var zNodes =[
    { id:1, pId:0, name:"半勾选 1", halfCheck:true, isParent:true},
    { id:2, pId:0, name:"半勾选 2", halfCheck:true, checked:true, isParent:true},
    { id:3, pId:0, name:"随意勾选 3", checked:true, isParent:true}
];

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
});