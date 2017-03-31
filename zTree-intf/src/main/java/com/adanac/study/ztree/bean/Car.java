package com.adanac.study.ztree.bean;

public class Car {
	public int id;
	public String name;
	public int pId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", pId=" + pId + "]";
	}
	
}
