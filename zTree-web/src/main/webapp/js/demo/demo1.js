/**
 * Created by allen on 2017/3/22.
 */
var $ctx = $("#ctx").val();
var setting = {
    async : {
        enable : true,//开启异步加载处理
        url : encodeURI(encodeURI("/peTreeDemo2/jsondata")),
        autoParam : [ "id" ],
        dataFilter : filter,
        contentType : "application/json",
        type : "get"
    },
    view : {
        expandSpeed : "",
        addHoverDom : addHoverDom,
        removeHoverDom : removeHoverDom,
        selectedMulti : false
    },
    edit : {
        enable : true
    },
    data : {
        simpleData : {
            enable : true
        }
    },
    callback : {
        beforeRemove : beforeRemove,
        beforeRename : beforeRename,
    }
};

function filter(treeId, parentNode, childNodes) {
    if (!childNodes)
        return null;
    for (var i = 0, l = childNodes.length; i < l; i++) {
        childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
    }
    return childNodes;
}
function beforeRemove(treeId, treeNode) {
    if (confirm("确认删除节点--" + treeNode.name + "--吗?")) {
        var param = "id=" + treeNode.id;
        $.post(encodeURI(encodeURI("/peTreeDemo2/jsondata?method=deletePp&"
            + param)));
    } else {
        return false;
    }
}
function beforeRename(treeId, treeNode, newName) {
    if (newName.length == 0) {
        alert("节点名称不能为空.");
        return false;
    }
    var param = "id=" + treeNode.id + "&name=" + newName;
    $.post(encodeURI(encodeURI("/peTreeDemo2/jsondata?method=updatePp&"
        + param)));
    return true;
}

function addHoverDom(treeId, treeNode) {
    var sObj = $("#" + treeNode.tId + "_span");
    if (treeNode.editNameFlag || $("#addBtn_" + treeNode.tId).length > 0)
        return;
    var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
        + "' title='add node' onfocus='this.blur();'></span>";
    sObj.after(addStr);
    var btn = $("#addBtn_" + treeNode.tId);
    if (btn)
        btn.bind("click", function() {
            var Ppname = prompt("请输入新节点名称");
            if (Ppname == null) {
                return;
            } else if (Ppname == "") {
                alert("节点名称不能为空");
            } else {
                var param ="&pId="+ treeNode.id + "&name=" + Ppname;
                var zTree = $.fn.zTree.getZTreeObj("treeDemo");
                $.post(
                    encodeURI(encodeURI("/peTreeDemo2/jsondata?method=addPp&"
                        + param)), function(data) {
                        if ($.trim(data) != null) {
                            var treenode = $.trim(data);
                            zTree.addNodes(treeNode, {
                                pId : treeNode.id,
                                name : Ppname
                            }, true);
                        }
                    })
            }

        });
};
function removeHoverDom(treeId, treeNode) {
    $("#addBtn_" + treeNode.tId).unbind().remove();
};
$(document).ready(function() {
    $.fn.zTree.init($("#treeDemo"), setting);
});