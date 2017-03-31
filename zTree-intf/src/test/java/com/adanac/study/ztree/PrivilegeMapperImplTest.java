package com.adanac.study.ztree;

import com.adanac.study.ztree.bean.Privilege;
import com.adanac.study.ztree.intf.PrivilegeMapper;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by allen on 2017/3/17.
 */
@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PrivilegeMapperImplTest {
    private Logger log = LoggerFactory.getLogger(PrivilegeMapperImplTest.class);

    @Autowired
    private PrivilegeMapper privilegeMapper;


    @Test
    public void insert() throws Exception {
        Privilege record = new Privilege();
        record.setId(101);
        record.setCode("cn_007");
        record.setCreateId("allen");
        record.setUpdateId("Feagle_Allen");
        record.setFunctionName("测试新增");
        record.setIsHidden(new Byte("0"));
        record.setIsLeafNode(new Byte("1"));
        record.setParentId(new Byte("5"));
        record.setSubSystemId(2);
        record.setValidity(new Byte("1"));
        int insert = privilegeMapper.insert(record);
        log.info(JSON.toJSONString(insert));
    }

    @Test
    public void insertSelective() throws Exception {
        Privilege record = new Privilege();
        record.setId(102);
        record.setCode("");
        record.setCreateId("allen");
        record.setUpdateId("Feagle_Allen");
        record.setFunctionName("测试新增insertSelective");
        record.setIsHidden(new Byte("0"));
        record.setIsLeafNode(new Byte("1"));
        record.setParentId(new Byte("5"));
        record.setSubSystemId(2);
        record.setValidity(new Byte("1"));
        int insert = privilegeMapper.insertSelective(record);
        log.info(JSON.toJSONString(insert));
    }


    @Test
    public void selectOneByCode() throws Exception {
        Privilege privilege = new Privilege();
        privilege.setCode("cn_007");
        Privilege privilege1 = privilegeMapper.selectOneByCode(privilege);
        log.info(JSON.toJSONString(privilege1));
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
        Privilege record = new Privilege();
        record.setId(102);
        record.setFunctionName("测试更新,通过updateByPrimaryKeySelective");
        int i = privilegeMapper.updateByPrimaryKeySelective(record);
        log.info(i + "");
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
        Privilege record = new Privilege();
        record.setId(102);
        record.setCode("cn_007");
        record.setCreateId("allen");
        record.setUpdateId("Feagle_Allen");
        record.setFunctionName("测试更新，通过updateByPrimaryKey");
        record.setIsHidden(new Byte("0"));
        record.setIsLeafNode(new Byte("1"));
        record.setParentId(new Byte("5"));
        record.setSubSystemId(2);
        record.setValidity(new Byte("1"));
        int i = privilegeMapper.updateByPrimaryKey(record);
        System.out.println(i);
    }

    @Test
    public void deleteByCode() throws Exception {
        Privilege privilege = new Privilege();
        privilege.setId(102);
        int count = privilegeMapper.deleteByCode(privilege);
        log.info(JSON.toJSONString(count));
    }
}