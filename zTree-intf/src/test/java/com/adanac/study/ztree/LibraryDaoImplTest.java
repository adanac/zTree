package com.adanac.study.ztree;

import com.adanac.study.ztree.bean.Library;
import com.adanac.study.ztree.intf.LibraryDao;
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
 * Created by allen on 2017/3/16.
 */
@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class LibraryDaoImplTest {
    private Logger log = LoggerFactory.getLogger(LibraryDaoImplTest.class);
    @Autowired
    private LibraryDao libraryDao;

    @Test
    public void listAllLibrary() throws Exception {
        List<Library> libraries = libraryDao.listAllLibrary();
        log.info(JSON.toJSONString(libraries));
    }

    @Test
    public void getLibraryByPid() throws Exception {
        Library library = new Library();
//        library.setPid(2);
        library.setName("山东省");//TODO Parameters为空字符串
        Library res = libraryDao.getLibraryByPid(library);
        log.info(JSON.toJSONString(res));
    }

    @Test
    public void getLastLibrary() throws Exception {
        Library library = new Library();
        library.setPid(2);
        int count = libraryDao.getLastLibrary(library);
        log.info(JSON.toJSONString(count));
    }

    @Test
    public void selectByPrimaryKey() throws Exception {

    }

    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void updateByPrimaryKey() throws Exception {

    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {

    }

}