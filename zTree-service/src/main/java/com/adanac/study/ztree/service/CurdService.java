package com.adanac.study.ztree.service;


import com.adanac.study.ztree.bean.ZTree;
import com.adanac.study.ztree.intf.CurdMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by allen on 2017/3/23.
 */
@Service
public class CurdService {
    Logger logger = LoggerFactory.getLogger(CurdService.class);
    @Autowired
    private CurdMapper curdMapper;

    public List<ZTree> list(){
        return curdMapper.list();
    }
    public int add(ZTree ztree){
        return curdMapper.insert(ztree);
    }
    public ZTree get(Integer id){
        return curdMapper.get(id.longValue());
    }
    public int update(ZTree zTree){
        return curdMapper.update(zTree);
    }
    public int delete(Integer id){
        return  curdMapper.delete(id);
    }
}
