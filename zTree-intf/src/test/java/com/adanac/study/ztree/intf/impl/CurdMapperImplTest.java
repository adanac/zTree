package com.adanac.study.ztree.intf.impl;

import com.adanac.study.ztree.bean.ZTree;
import com.adanac.study.ztree.intf.CurdMapper;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by allen on 2017/3/23.
 */
@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CurdMapperImplTest {
    private Logger logger = LoggerFactory.getLogger(CurdMapperImpl.class);
    @Autowired
    private CurdMapper curdMapper;

    @Test
    public void list() throws Exception {
        List<ZTree> list = curdMapper.list();
        logger.info(JSON.toJSONString(list));
    }

    @Test
    public void insert() throws Exception {
        ZTree ztree = new ZTree();
        ztree.setPid(0);
        ztree.setId(6);
        ztree.setName("父节点1");
        int insert = curdMapper.insert(ztree);
        logger.info(JSON.toJSONString(insert));
    }

    @Test
    public void get() throws Exception {
        ZTree zTree = curdMapper.get(1L);
        logger.info(JSON.toJSONString(zTree));
    }

    @Test
    public void update() throws Exception {
        ZTree ztree = new ZTree();
        ztree.setId(6);
        ztree.setName("修改后的爷节点");
        int update = curdMapper.update(ztree);
        logger.info(JSON.toJSONString(update));
    }

    @Test
    public void delete() throws Exception {
        int delete = curdMapper.delete(6);
        logger.info(JSON.toJSONString(delete));
    }

}