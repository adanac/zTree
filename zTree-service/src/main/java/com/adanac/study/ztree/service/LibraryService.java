package com.adanac.study.ztree.service;

import com.adanac.study.ztree.bean.Library;
import com.adanac.study.ztree.intf.LibraryDao;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by allen on 2017/3/15.
 */
@Service
public class LibraryService {
    protected final static Log log = LogFactory.getLog(LibraryService.class);

    @Autowired
    private LibraryDao libraryMapper;

    /**
     * 查询所有分类信息
     *
     * @return
     */
    public List<Object> findAllLibrary() {
        List<Object> listZTree = new ArrayList<Object>();
        List<Library> listLibrary = libraryMapper.listAllLibrary();
        String str = "";
        for (int i = 0; i < listLibrary.size(); i++) {
            Library library = listLibrary.get(i);//分类信息
            str = "{id:" + library.getId() + ", pId:" + library.getPid() + ", name:\"" + library.getName() + "\" }";//封装ztree需要格式的字符串
            log.info(str);
            listZTree.add(str);
        }
        return listZTree;
    }

    /**
     * 保存或更新分类信息
     *
     * @param library
     * @return
     */
    public String addOrUpdateLibrary(Library library) {
        int numFlag = 0;
        //根据id查询分类信息
        if (StringUtils.isBlank(library.getId().toString())) {
            return "error";
        }
        Library lib = libraryMapper.getLibraryByPid(library);
        if (lib != null) {//更新信息
            library.setUpdateTime(new Date().toString());
            library.setCreateUser(null);
            library.setPid(null);
            numFlag = libraryMapper.updateByPrimaryKeySelective(library);
        } else {//插入信息
            if (library.getPid().equals("null")) {
                library.setPid(0);
            }
            int orderId = libraryMapper.getLastLibrary(library);
            orderId++;
            library.setCreateTime(new Date().toString());
            library.setUpdateTime(new Date().toString());
            library.setOrderId(orderId);
            numFlag = libraryMapper.insert(library);
        }
        return "success";
    }

    /**
     * 删除分类
     *
     * @param id
     * @return
     */
    public String deleteLibrary(String id) {
        int num = libraryMapper.deleteByPrimaryKey(Long.parseLong(id));
        return "success";
    }

}