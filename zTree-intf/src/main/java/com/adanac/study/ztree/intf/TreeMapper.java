package com.adanac.study.ztree.intf;


import com.adanac.study.ztree.bean.Tree;

import java.util.List;

public interface TreeMapper {
    List<Tree> listTreeByPid(Integer pid);

    int deleteByPrimaryKey(Integer id);

    int insert(Tree record);

    int insertSelective(Tree record);

    Tree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tree record);

    int updateByPrimaryKey(Tree record);
}