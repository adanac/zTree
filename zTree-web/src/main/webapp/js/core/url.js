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
    { id:1, pId:0, name:"zTree Home", url:"http://www.treejs.cn/", target:"_blank"},
    { id:2, pId:0, name:"zTree in Google", url:"http://code.google.com/p/jquerytree/", target:"_blank"},
    { id:3, pId:0, name:"zTree in Iteye", url:"http://ztreeapi.iteye.com/", target:"_blank"},
    { id:4, pId:0, name:"Nothing...", url:"", target:"_blank", click:"alert('我是不会跳转的...');"}
];

$(document).ready(function(){
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
});