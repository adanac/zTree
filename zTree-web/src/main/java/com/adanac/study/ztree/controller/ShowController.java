package com.adanac.study.ztree.controller;

import com.adanac.study.ztree.bean.ZtreeBean;
import com.adanac.study.ztree.vo.TreeNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping(value="/ztree")
public class ShowController {

	@RequestMapping(value="/hxData")
	public String hxData(){
		return "demo/hxData";
	}

	@RequestMapping(value="/toDemo1")
	public String toDemo1(){
		return "demo1";
	}
	
	@RequestMapping(value="/showData")
	@ResponseBody
	public List<TreeNode> showData(HttpSession session)throws Exception{
		System.err.println(".........++++++++");
		return getList();
	}

	@RequestMapping(value="/showData2")
	@ResponseBody
	public List<ZtreeBean> showData2(HttpSession session)throws Exception{
		List<ZtreeBean> listBean = new ArrayList<ZtreeBean>();
		System.err.println("showData2...");
		ZtreeBean zb1 = new ZtreeBean(1,0,"zb1",true);
		ZtreeBean zb2 = new ZtreeBean(2,1,"zb2",true);
		ZtreeBean zb3 = new ZtreeBean(3,2,"zb3",false);
		ZtreeBean zb4 = new ZtreeBean(4,2,"zb4",true);
		listBean.add(zb1);
		listBean.add(zb2);
		listBean.add(zb3);
		listBean.add(zb4);
		return listBean;
	}

	@RequestMapping(value="/showData3")
	@ResponseBody
	public String showData3(HttpServletRequest request)throws Exception{
		String id = request.getParameter("id");
		if(null == id){
			System.out.println("id is null");
			id = "1";
		}
		System.err.println("showData3..."+id);
		List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
		for(int i = 0; i < 5; i++){
			HashMap<String,Object> hm = new HashMap<String,Object>();   //最外层，父节点
			hm.put("id",id+i);//id属性  ，数据传递
			hm.put("name", "name"+id+i); //name属性，显示节点名称
			hm.put("pId", id);
			list.add(hm);
		}
		return JSON.toJSONString(list);
	}

	@RequestMapping(value="/test1", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String test1()throws Exception{
		String s1 = "{id:1, pId:0, name:\"test1\" , open:true}";
		String s2 = "{id:2, pId:1, name:\"test2\" , open:true}";
		String s3 = "{id:3, pId:1, name:\"test3\" , open:true}";
		String s4 = "{id:4, pId:2, name:\"test4\" , open:true}";
		List<String> lstTree = new ArrayList<String>();
		lstTree.add(s1);
		lstTree.add(s2);
		lstTree.add(s3);
		lstTree.add(s4);
		return JSONArray.toJSONString(lstTree);
	}
	@RequestMapping(value="/test2")
	@ResponseBody
	public String test2()throws Exception{
		List<TreeNode> list = getList();
		return JSONArray.toJSONString(list);
	}

	public List<TreeNode> getList(){
		List<TreeNode> list = new ArrayList<TreeNode>();
		list.add(new TreeNode("1","0","随意勾选 1",false,false,false));
		list.add(new TreeNode("11","1","随意勾选 1-1",true,false,false));
		list.add(new TreeNode("111","11","无 checkbox 1-1-1",false,true,false));
		list.add(new TreeNode("112","11","随意勾选 1-1-2",false,false,true));
		list.add(new TreeNode("12","1","无 checkbox 1-2",true,true,false));
		list.add(new TreeNode("121","12","无 checkbox 1-2-1",false,true,false));
		list.add(new TreeNode("122","12","无 checkbox 1-2-2",false,true,false));
		//上一层都不能nocheck,open的话，那子层肯定也不能open和check了，所以父层要设置false,如果设置true，那子层设置就没意义
		list.add(new TreeNode("2","0","随意勾选 2",true,false,false)); 
		list.add(new TreeNode("21","2","随意勾选 2-1",false,false,false));
		list.add(new TreeNode("22","2","随意勾选 2-2",false,false,false));
		list.add(new TreeNode("221","22","随意勾选 2-2-1",false,false,false));
		list.add(new TreeNode("222","22","随意勾选 2-2-2",false,false,false));
		list.add(new TreeNode("23","2","随意勾选 2-3",false,false,false));
		return list;
	}
}
