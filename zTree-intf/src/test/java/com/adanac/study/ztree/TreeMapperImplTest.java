package com.adanac.study.ztree;

import com.adanac.study.ztree.bean.Tree;
import com.adanac.study.ztree.intf.TreeMapper;
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
 * Created by allen on 2017/3/17.
 */
@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TreeMapperImplTest {
    private Logger log = LoggerFactory.getLogger(TreeMapperImplTest.class);
    @Autowired
    private TreeMapper treeMapper;
    @Test
    public void listTreeByPid() throws Exception {
        Integer pid = 0;
        List<Tree> trees = treeMapper.listTreeByPid(pid);
        log.info(JSON.toJSONString(trees));
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {

    }

}