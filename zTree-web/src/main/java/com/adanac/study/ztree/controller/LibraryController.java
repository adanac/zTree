package com.adanac.study.ztree.controller;

import com.adanac.study.common.util.UUIDUtil;
import com.adanac.study.ztree.bean.Library;
import com.adanac.study.ztree.constant.Constants;
import com.adanac.study.ztree.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by allen on 2017/3/15.
 */
@Controller
@RequestMapping(value="/library")
public class LibraryController {

    @Autowired
    public LibraryService libraryService;

    /**
     * 跳转到分类页面
     * @return
     */
    @RequestMapping(value="/toListLibrary")
    public String toListLibrary(){
        return "library/listLibrary";
    }

    /**
     * 查询所有分类信息
     * @return
     */
    @RequestMapping(value="/findAllLibrary")
    @ResponseBody
    public List<Object> findAllLibrary(HttpServletRequest request, HttpServletResponse response){
        return libraryService.findAllLibrary();
    }

    /**
     * 保存分类
     * @return
     */
    @RequestMapping(value="/saveLibrary")
    @ResponseBody
    public String saveLibrary(HttpServletRequest request, HttpServletResponse response){
        String libraryId = UUIDUtil.getUuid();
        return libraryId;
    }

    /**
     * 更新分类名称
     * @return
     */
    @RequestMapping(value="/updateLibraryName")
    @ResponseBody
    public String updateLibraryName(HttpServletRequest request, HttpServletResponse response, Library library) {
        String createname=(String) request.getSession().getAttribute(Constants.CURRENT_USER_NAME);
        library.setCreateUser(createname);
        library.setUpdateUser(createname);
        return libraryService.addOrUpdateLibrary(library);
    }


    /**
     * 删除分类
     * @return
     */
    @RequestMapping(value="/deleteLibrary")
    @ResponseBody
    public String deleteLibrary(HttpServletRequest request, HttpServletResponse response,@RequestParam(value = "id") String id) {
        return libraryService.deleteLibrary(id);
    }
}
