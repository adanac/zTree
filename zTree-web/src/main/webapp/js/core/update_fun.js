/**
 * Created by allen on 2017/3/16.
 */
var $ctx = $("#ctx").val();
console.log($ctx);
var setting = {
    view: {
        selectedMulti: false
    },
    data: {
        simpleData: {
            enable: true
        }
    }
};

var zNodes =[
    { id:1, pId:0, name:"父节点1", open:true},
    { id:11, pId:1, name:"叶子节点1"},
    { id:12, pId:1, name:"叶子节点2"},
    { id:13, pId:1, name:"叶子节点3"},
    { id:2, pId:0, name:"父节点2", open:true},
    { id:21, pId:2, name:"叶子节点1"},
    { id:22, pId:2, name:"叶子节点2"},
    { id:23, pId:2, name:"叶子节点3"},
    { id:3, pId:0, name:"父节点3", open:true },
    { id:31, pId:3, name:"叶子节点1"},
    { id:32, pId:3, name:"叶子节点2"},
    { id:33, pId:3, name:"叶子节点3"}
];

var nameCount = 0, iconCount = 1, color = [0, 0, 0];
function updateNode(e) {
    var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
        type = e.data.type,
        nodes = zTree.getSelectedNodes();
    if (nodes.length == 0) {
        alert("请先选择一个节点");
    }
    for (var i=0, l=nodes.length; i<l; i++) {
        zTree.setting.view.fontCss = {};
        if (type == "rename") {
            nodes[i].name = nodes[i].name.replace(/_[\d]*$/g, "") + "_" + (nameCount++);
        } else if (type == "icon") {
            if (iconCount > 8) {
                nodes[i].iconSkin = null;
                iconCount = 1;
            } else if (nodes[i].isParent) {
                nodes[i].iconSkin = nodes[i].iconSkin ? null : "pIcon01";
            } else {
                nodes[i].iconSkin = "icon0" + (iconCount++);
            }
        } else if (type == "color") {
            color = [0, 0, 0];
            var r1 = Math.round(Math.random()*3 - 0.5);
            color[r1] = 15;
            var r2 = Math.round(Math.random()*3 - 0.5);
            while (r2 === r1) {
                r2 = Math.round(Math.random()*3 - 0.5);
            }
            color[r2] = Math.round(Math.random()*16-0.5);
            zTree.setting.view.fontCss["color"] = "#"+color[0].toString(16)+color[1].toString(16)+color[2].toString(16);
        } else if (type == "font") {
            var style = $("#" + nodes[i].tId + "_a").css("font-style") ;
            style = (style=="italic" ? "normal" : "italic");
            zTree.setting.view.fontCss["font-style"] = style;
        }
        zTree.updateNode(nodes[i]);
    }
}

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    $("#rename").bind("click", {type:"rename"}, updateNode);
    $("#changeIcon").bind("click", {type:"icon"}, updateNode);
    $("#changeColor").bind("click", {type:"color"}, updateNode);
    $("#changeFont").bind("click", {type:"font"}, updateNode);
});
