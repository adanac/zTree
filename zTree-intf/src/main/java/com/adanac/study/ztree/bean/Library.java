package com.adanac.study.ztree.bean;

import java.io.Serializable;

/**
 * Created by allen on 2017/3/15.
 */
public class Library implements Serializable{
    private Integer id;
    private Integer pid;
    private String name;
    private String createTime;
    private String updateTime;
    private Integer isDelete;
    private String createUser;
    private String updateUser;
    private Integer levelId;
    private Integer orderId;

    public Library() {
        super();
    }

    public Library(Integer id, Integer pid, String name, String createTime, String updateTime, Integer isDelete, String createUser, String updateUser, Integer levelId, Integer orderId) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.levelId = levelId;
        this.orderId = orderId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
