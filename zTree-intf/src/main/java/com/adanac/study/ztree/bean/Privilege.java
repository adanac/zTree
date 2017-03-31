package com.adanac.study.ztree.bean;

import java.io.Serializable;
import java.util.Date;

public class Privilege implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    /**
     *
     */
    private String createId;

    /**
     *
     */
    private String updateId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 有效性 1.有效 0. 无效
     */
    private Byte validity;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String functionName;

    /**
     * 父节点
     */
    private Byte parentId;

    /**
     * 是否叶子节点(叶子结点 就是度为0的结点 就是没有子结点的结点),在添加子节点时,需要将parent_id is_leaf_node 设置成0
     */
    private Byte isLeafNode;

    /**
     * 所属子系统
     */
    private Integer subSystemId;

    /**
     * UI是否隐藏,ui上不展示
     */
    private Byte isHidden;

    /**
     * t_ztree_privilege
     */
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     *
     * @return id 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return create_id
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * @param createId
     */
    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    /**
     * @return update_id
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * @param updateId
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    /**
     * 创建时间
     *
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     *
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 有效性 1.有效 0. 无效
     *
     * @return validity 有效性 1.有效 0. 无效
     */
    public Byte getValidity() {
        return validity;
    }

    /**
     * 有效性 1.有效 0. 无效
     *
     * @param validity 有效性 1.有效 0. 无效
     */
    public void setValidity(Byte validity) {
        this.validity = validity;
    }

    /**
     * 编码
     *
     * @return code 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 名称
     *
     * @return function_name 名称
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * 名称
     *
     * @param functionName 名称
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    /**
     * 父节点
     *
     * @return parent_id 父节点
     */
    public Byte getParentId() {
        return parentId;
    }

    /**
     * 父节点
     *
     * @param parentId 父节点
     */
    public void setParentId(Byte parentId) {
        this.parentId = parentId;
    }

    /**
     * 是否叶子节点(叶子结点 就是度为0的结点 就是没有子结点的结点),在添加子节点时,需要将parent_id is_leaf_node 设置成0
     *
     * @return is_leaf_node 是否叶子节点(叶子结点 就是度为0的结点 就是没有子结点的结点),在添加子节点时,需要将parent_id is_leaf_node 设置成0
     */
    public Byte getIsLeafNode() {
        return isLeafNode;
    }

    /**
     * 是否叶子节点(叶子结点 就是度为0的结点 就是没有子结点的结点),在添加子节点时,需要将parent_id is_leaf_node 设置成0
     *
     * @param isLeafNode 是否叶子节点(叶子结点 就是度为0的结点 就是没有子结点的结点),在添加子节点时,需要将parent_id is_leaf_node 设置成0
     */
    public void setIsLeafNode(Byte isLeafNode) {
        this.isLeafNode = isLeafNode;
    }

    /**
     * 所属子系统
     *
     * @return sub_system_id 所属子系统
     */
    public Integer getSubSystemId() {
        return subSystemId;
    }

    /**
     * 所属子系统
     *
     * @param subSystemId 所属子系统
     */
    public void setSubSystemId(Integer subSystemId) {
        this.subSystemId = subSystemId;
    }

    /**
     * UI是否隐藏,ui上不展示
     *
     * @return is_hidden UI是否隐藏,ui上不展示
     */
    public Byte getIsHidden() {
        return isHidden;
    }

    /**
     * UI是否隐藏,ui上不展示
     *
     * @param isHidden UI是否隐藏,ui上不展示
     */
    public void setIsHidden(Byte isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createId=").append(createId);
        sb.append(", updateId=").append(updateId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", validity=").append(validity);
        sb.append(", code=").append(code);
        sb.append(", functionName=").append(functionName);
        sb.append(", parentId=").append(parentId);
        sb.append(", isLeafNode=").append(isLeafNode);
        sb.append(", subSystemId=").append(subSystemId);
        sb.append(", isHidden=").append(isHidden);
        sb.append("]");
        return sb.toString();
    }
}