/**
 * Created by allen on 2017/3/16.
 */
var $ctx = $("#ctx").val();
console.log($ctx);

var setting = {
    view: {
        fontCss: getFont,
        nameIsHTML: true
    }
};

var zNodes =[
    { name:"粗体字", font:{'font-weight':'bold'} },
    { name:"斜体字", font:{'font-style':'italic'}},
    { name:"有背景的字", font:{'background-color':'black', 'color':'white'}},
    { name:"红色字", font:{'color':'red'}},
    { name:"蓝色字", font:{'color':'blue'}},
    { name:"<span style='color:blue;margin-right:0px;'>view</span>.<span style='color:red;margin-right:0px;'>nameIsHTML</span>"},
    { name:"zTree 默认样式"}
];

function getFont(treeId, node) {
    return node.font ? node.font : {};
}

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
});