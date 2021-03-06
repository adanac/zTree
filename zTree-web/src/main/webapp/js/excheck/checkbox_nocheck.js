/**
 * Created by allen on 2017/3/21.
 */
var $ctx = $("#ctx").val();
var setting = {
    check: {
        enable: true,
        nocheckInherit: true
    },
    data: {
        simpleData: {
            enable: true
        }
    }
};

var zNodes =[
    { id:1, pId:0, name:"随意勾选 1", open:true},
    { id:11, pId:1, name:"随意勾选 1-1", open:true},
    { id:111, pId:11, name:"无 checkbox 1-1-1", nocheck:true},
    { id:112, pId:11, name:"随意勾选 1-1-2"},
    { id:12, pId:1, name:"无 checkbox 1-2", nocheck:true, open:true},
    { id:121, pId:12, name:"无 checkbox 1-2-1"},
    { id:122, pId:12, name:"无 checkbox 1-2-2"},
    { id:2, pId:0, name:"随意勾选 2", checked:true, open:true},
    { id:21, pId:2, name:"随意勾选 2-1"},
    { id:22, pId:2, name:"随意勾选 2-2", open:true},
    { id:221, pId:22, name:"随意勾选 2-2-1", checked:true},
    { id:222, pId:22, name:"随意勾选 2-2-2"},
    { id:23, pId:2, name:"随意勾选 2-3"}
];

function nocheckNode(e) {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
        nocheck = e.data.nocheck,
        nodes = zTree.getSelectedNodes();
    if (nodes.length == 0) {
        alert("请先选择一个节点");
    }

    for (var i=0, l=nodes.length; i<l; i++) {
        nodes[i].nocheck = nocheck;
        zTree.updateNode(nodes[i]);
    }
}

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    $("#nocheckTrue").bind("click", {nocheck: true}, nocheckNode);
    $("#nocheckFalse").bind("click", {nocheck: false}, nocheckNode);
});