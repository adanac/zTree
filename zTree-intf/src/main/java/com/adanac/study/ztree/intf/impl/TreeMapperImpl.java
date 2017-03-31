package com.adanac.study.ztree.intf.impl;

import com.adanac.study.common.intf.impl.BaseDaoSupport;
import com.adanac.study.ztree.bean.Tree;
import com.adanac.study.ztree.intf.TreeMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allen on 2017/3/17.
 */
@Repository("treeMapper")
public class TreeMapperImpl extends BaseDaoSupport<Tree, Long>  implements TreeMapper {
    private static final String NAMESPACE = "mybatis.mapper.TreeMapper";
    public TreeMapperImpl(){
        super(NAMESPACE);
    }

    @Override
    public List<Tree> listTreeByPid(Integer pid) {
        return this.getMySqlSessionTemplate().selectList(NAMESPACE+".listTreeByPid");
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Tree record) {
        return 0;
    }

    @Override
    public int insertSelective(Tree record) {
        return 0;
    }

    @Override
    public Tree selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Tree record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Tree record) {
        return 0;
    }
}
