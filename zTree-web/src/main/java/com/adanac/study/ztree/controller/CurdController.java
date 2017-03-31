package com.adanac.study.ztree.controller;

import com.adanac.study.ztree.bean.ZTree;
import com.adanac.study.ztree.service.CurdService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by allen on 2017/3/22.
 */
@Controller
@RequestMapping(value="/curd")
public class CurdController {
    @Autowired
    private CurdService curdService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public String list(){
        List<ZTree> list = curdService.list();
        if(list!=null && list.size()>0){
            return JSON.toJSONString(list);
        }else{
            return "list error";
        }
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public String add(ZTree zTree){
        int add = curdService.add(zTree);
        if(add>0){
            return "success";
        }else{
            return "error";
        }
    }
    @RequestMapping(value = "/get")
    @ResponseBody
    public String get(Integer id){
        ZTree zTree = curdService.get(id);
        if(zTree!=null){
            return JSON.toJSONString(zTree);
        }else{
            return "get error";
        }
    }
    @RequestMapping(value = "/update")
    @ResponseBody
    public String update(ZTree zTree){
        int update = curdService.update(zTree);
        if(update>0){
            return "success";
        }else{
            return "update error";
        }
    }
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String add(@RequestParam("delId") int id){
        int delete = curdService.delete(id);
        if(delete>0){
            return "success";
        }else{
            return "delete error";
        }
    }
}
