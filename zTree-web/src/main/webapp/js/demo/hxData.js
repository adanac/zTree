/**
 * Created by allen on 2017/3/22.
 */
var $ctx = $("#ctx").val();
var setting = {
    check: {
        enable: true
    },
    data: {
        simpleData: {
            enable: true,
            idKey: "id",
            pIdKey: "pid"
        }
    },
    callback:{
        onCheck:onCheck
    }
};

function onCheck(e, treeId, treeNode) {
    var treeObj = $.fn.zTree.getZTreeObj("treeDemo"),
        nodes = treeObj.getCheckedNodes(true),
        k = "";
        v = "";
    for (var i = 0; i < nodes.length; i++) {
        if(!nodes[i].isParent){
            k += nodes[i].id + ",";
            v += nodes[i].name + ",";
        }
    }
    if(k!=""){
        k = k.substr(0,k.length-1);
    }
    if(v!=""){
        v = v.substr(0,v.length-1);
    }
    alert('k:'+k);
    alert('v:'+v);
}

$(document).ready(function () {
    var zNodes = initZtree();
    $.fn.zTree.init($("#treeDemo"), setting, zNodes);
    zTree_Menu = $.fn.zTree.getZTreeObj("treeDemo");    // 获取 zTree 对象，是一个全局变量，用户可以随时使用此方法获取需要进行操作的 zTree 对象

    // var sel = zTree_Menu.getNodeByParam('id', '103');
    /* tree.expandNode(sel,true,true, true, true);
     tree.selectNode(sel); */
    // $("#" + sel.tId + "_a").click();

    // 选中指定的节点
    // var node = zTree_Menu.getNodeByParam("id",103 );
    // zTree_Menu.selectNode(node,true);//指定选中ID的节点
    // zTree_Menu.expandNode(node, true, false);//指定选中ID节点展开
    var tids = [103,102];
    var nodes = zTree_Menu.transformToArray(zTree_Menu.getNodes());
    if (nodes.length > 0) {
        for(var j =0;j<tids.length;j++){
            for (var i = 0; i < nodes.length; i++) {
                if (nodes[i].id == tids[j]) {
                    nodes[i].checked = true;
                    zTree_Menu.updateNode(nodes[i]);
                    zTree_Menu.selectNode(nodes[i],true);//指定选中ID的节点
                    zTree_Menu.expandNode(nodes[i], true, false);//指定选中ID节点展开
                }
            }
        }
    }
})
;

function initZtree() {
    var res = "";
    $.ajax({
        async: false, //是否异步
        cache: false, //是否使用缓存
        type: 'post', //请求方式,post
        dataType: "json", //数据传输格式
        url: $ctx + "/curd/list.do", //请求链接
        error: function () {
            alert('亲，网络有点不给力呀！');
        },
        success: function (data) {
            // ztreeNodes = eval("[" + data + "]"); //将string类型转换成json对象
            res = ztreeNodes = data;
        }
    });
    return res;
}