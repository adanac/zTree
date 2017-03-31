/**
 * Created by allen on 2017/3/16.
 */
var $ctx = $("#ctx").val();
console.log($ctx);

var setting = {
    check: {
        enable: true
    },
    async: {
        enable: true,
        url: $ctx +"/ztree/showData3.do",
        autoParam:["id", "name=n", "level=lv"],
        otherParam:{"otherParam":"zTreeAsyncTest"},
        dataFilter: filter
    }
};

function filter(treeId, parentNode, childNodes) {
    if (!childNodes) return null;
    for (var i=0, l=childNodes.length; i<l; i++) {
        childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
    }
    return childNodes;
}

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting);
});