package com.adanac.study.ztree.intf;

import com.adanac.study.common.intf.BaseDao;
import com.adanac.study.ztree.bean.Library;

import java.util.List;

/**
 * Created by allen on 2017/3/15.
 */
public interface LibraryDao extends BaseDao<Library,Long> {
    /**
     * 查询所有分类信息
     * @return
     */
    public List<Library> listAllLibrary();


    /**
     * 根据id查询条数
     * @return
     */
    public Library getLibraryByPid(Library library);

    /**
     * 查询最大排序号
     * @return
     */
    public int getLastLibrary(Library library);
}
