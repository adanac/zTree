package com.adanac.study.ztree.bean;

import java.io.Serializable;

/**
 * Created by allen on 2017/3/21.
 */
public class ZtreeBean implements Serializable {
    private Integer id;
    private Integer pid;
    private String name;
    private boolean open;

    public ZtreeBean(Integer id, Integer pid, String name, boolean open) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.open = open;
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

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
