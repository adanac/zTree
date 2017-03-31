/**
 * Created by allen on 2017/3/16.
 */
var $ctx = $("#ctx").val();
console.log($ctx);

var setting = {

    data: {
        simpleData: {
            enable: true
        }
    }
};

var zNodes =[
    { id:1, pId:0, name:"展开、折叠 自定义图标不同", open:true, iconSkin:"pIcon01"},
    { id:11, pId:1, name:"叶子节点1", iconSkin:"icon01"},
    { id:12, pId:1, name:"叶子节点2", iconSkin:"icon02"},
    { id:13, pId:1, name:"叶子节点3", iconSkin:"icon03"},
    { id:2, pId:0, name:"展开、折叠 自定义图标相同", open:true, iconSkin:"pIcon02"},
    { id:21, pId:2, name:"叶子节点1", iconSkin:"icon04"},
    { id:22, pId:2, name:"叶子节点2", iconSkin:"icon05"},
    { id:23, pId:2, name:"叶子节点3", iconSkin:"icon06"},
    { id:3, pId:0, name:"不使用自定义图标", open:true },
    { id:31, pId:3, name:"叶子节点1"},
    { id:32, pId:3, name:"叶子节点2"},
    { id:33, pId:3, name:"叶子节点3"}
];

function showIconForTree(treeId, treeNode) {
    return !treeNode.isParent;
}

$(document).ready(function () {
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
});