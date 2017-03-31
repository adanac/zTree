package com.adanac.study.ztree.intf.impl;

import com.adanac.study.common.intf.impl.BaseDaoSupport;
import com.adanac.study.ztree.bean.ZTree;
import com.adanac.study.ztree.intf.CurdMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by allen on 2017/3/22.
 */
@Repository("curdMapper")
public class CurdMapperImpl extends BaseDaoSupport<ZTree,Long> implements CurdMapper {
    /**
     * 构造函数
     *
     * @param nameSpace Mybatis Mapper 的命名空间
     */
    private static final String NAMESPACE = "mybatis.mapper.CurdMapper";
    public CurdMapperImpl() {
        super(NAMESPACE);
    }

    @Override
    public List<ZTree> list() {
        return this.getMySqlSessionTemplate().selectList(NAMESPACE+".list");
    }

    @Override
    public int insert(ZTree zTree) {
        return this.getMySqlSessionTemplate().insert(NAMESPACE+".insert",zTree);
    }

    @Override
    public ZTree get(Long id) {
        return this.getMySqlSessionTemplate().selectOne(NAMESPACE+".get",id);
    }

    @Override
    public int update(ZTree zTree) {
        return this.getMySqlSessionTemplate().update(NAMESPACE+".update",zTree);
    }

    @Override
    public int delete(Integer id) {
        return this.getMySqlSessionTemplate().delete(NAMESPACE+".delete",id);
    }
}
