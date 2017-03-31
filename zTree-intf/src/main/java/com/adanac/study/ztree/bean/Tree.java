package com.adanac.study.ztree.bean;

import java.io.Serializable;

/**
 * Created by allen on 2017/3/17.
 */
public class Tree implements Serializable {

    private Integer id;
    private Integer pid;
    private String name;

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
}
