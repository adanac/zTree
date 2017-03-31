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
        onCheck: onCheck
    }
};

var zNodes =[
    { id:1, pId:0, name:"随意勾选 1", open:true},
    { id:11, pId:1, name:"随意勾选 1-1"},
    { id:12, pId:1, name:"随意勾选  1-2", open:true},
    { id:121, pId:12, name:"随意勾选 1-2-1", checked:true},
    { id:122, pId:12, name:"随意勾选 1-2-2"},
    { id:123, pId:12, name:"随意勾选 1-2-3"},
    { id:13, pId:1, name:"随意勾选 1-3"},
    { id:2, pId:0, name:"随意勾选 2", open:true},
    { id:21, pId:2, name:"随意勾选 2-1"},
    { id:22, pId:2, name:"随意勾选 2-2", open:true},
    { id:221, pId:22, name:"随意勾选 2-2-1", checked:true},
    { id:222, pId:22, name:"随意勾选 2-2-2"},
    { id:223, pId:22, name:"随意勾选 2-2-3"},
    { id:23, pId:2, name:"随意勾选 2-3", checked:true}
];

var clearFlag = false;
function onCheck(e, treeId, treeNode) {
    count();
    if (clearFlag) {
        clearCheckedOldNodes();
    }
}
function clearCheckedOldNodes() {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
        nodes = zTree.getChangeCheckedNodes();
    for (var i=0, l=nodes.length; i<l; i++) {
        nodes[i].checkedOld = nodes[i].checked;
    }
}
function count() {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
        checkCount = zTree.getCheckedNodes(true).length,
        nocheckCount = zTree.getCheckedNodes(false).length,
        changeCount = zTree.getChangeCheckedNodes().length;
    $("#checkCount").text(checkCount);
    $("#nocheckCount").text(nocheckCount);
    $("#changeCount").text(changeCount);

}
function createTree() {
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    count();
    clearFlag = $("#last").attr("checked");
}

$(document).ready(function(){
    createTree();
    $("#init").bind("change", createTree);
    $("#last").bind("change", createTree);
});