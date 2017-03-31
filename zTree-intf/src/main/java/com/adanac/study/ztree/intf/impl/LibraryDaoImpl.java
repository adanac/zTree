package com.adanac.study.ztree.intf.impl;

import com.adanac.study.common.intf.impl.BaseDaoSupport;
import com.adanac.study.ztree.bean.Library;
import com.adanac.study.ztree.intf.LibraryDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allen on 2017/3/15.
 */
@Repository("libraryDao")
public class LibraryDaoImpl extends BaseDaoSupport<Library, Long> implements LibraryDao {

    private static final String NAMESPACE = "mybatis.mapper.LibraryMapper";

    /**
     * 默认构造函数
     */
    public LibraryDaoImpl() {
        super(NAMESPACE);
    }

    @Override
    public List<Library> listAllLibrary() {
        try {
            return this.getMySqlSessionTemplate().selectList(NAMESPACE + ".listAllLibrary");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Library getLibraryByPid(Library library) {
        return this.getMySqlSessionTemplate().selectOne(NAMESPACE+".getLibraryByPid");
    }

    @Override
    public int getLastLibrary(Library library) {
        return 0;
    }
}
