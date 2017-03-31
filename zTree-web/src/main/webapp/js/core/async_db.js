/**
 * Created by allen on 2017/3/16.
 */
var $ctx = $("#ctx").val();
console.log($ctx+"...async_db");

var setting = {
    async: {
        enable: true,
        url: getUrl,
        dataFilter: filter
    },
    check: {
        enable: true,
        autoCheckTrigger: false,
        chkboxType:{ "Y": "", "N": "" }
    },
    data: {
        simpleData: {
            enable: true
        }
    },
    callback: {
        onCheck: onCheck,
        onClick : zTreeOnClick,
        beforeCheck : onBeforeCheck,
        beforeExpand: beforeExpand,
        onAsyncSuccess: onAsyncSuccess
    }
};

var zNodes =[];
var childNodesLength = 0;
var _childNodesLength = 0;
function filter(treeId, parentNode, childNodes){
    var _childNodes = childNodes.content.result;
    childNodesLength = _childNodes.length;
    $.each(_childNodes, function(i,val){
        if(this.isParent == "true"){
           
        }
    });
    return _childNodes;
}
$(document).ready(function(){
    initZtree();
});
function initZtree() {
    $.ajax({
        url: $ctx +'/ztree/showData2.do',
        type:'get',
        success:function(_data){
            if(_data.success == true){
                zNodes = _data.content.result;
                $.each(zNodes, function(i,val){
                    if(this.isParent == "true"){
                        //this.nocheck = true;
                    }
                });
                $.fn.zTree.init($("#treeDemo"), setting, zNodes);
            }else{
                layer.alert("获取部门结构失败！", {icon: 8});
                return false;
            }

        }
    });
}