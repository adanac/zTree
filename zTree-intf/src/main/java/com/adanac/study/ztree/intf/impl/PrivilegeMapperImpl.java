package com.adanac.study.ztree.intf.impl;

import com.adanac.study.common.intf.impl.BaseDaoSupport;
import com.adanac.study.ztree.bean.Privilege;
import com.adanac.study.ztree.intf.PrivilegeMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by allen on 2017/3/17.
 */
@Repository("privilegeMapper")
public class PrivilegeMapperImpl extends BaseDaoSupport<Privilege, Long> implements PrivilegeMapper {
    private static final String NAMESPACE = "mybatis.mapper.PrivilegeMapper";

    /**
     * 构造函数
     *
     * @param
     */
    public PrivilegeMapperImpl() {
        super(NAMESPACE);
    }

    @Override
    public int deleteByCode(Privilege privilege) {
        return this.getMySqlSessionTemplate().delete(NAMESPACE + ".deleteByCode", privilege);
    }

    @Override
    public int insert(Privilege record) {
        return this.getMySqlSessionTemplate().insert(NAMESPACE + ".insert", record);
    }

    @Override
    public int insertSelective(Privilege record) {
        return this.getMySqlSessionTemplate().insert(NAMESPACE + ".insertSelective", record);
    }


    @Override
    public Privilege selectOneByCode(Privilege privilege) {
        return this.getMySqlSessionTemplate().selectOne(NAMESPACE + ".selectOneByCode", privilege);
    }

    @Override
    public int updateByPrimaryKeySelective(Privilege record) {
        return this.getMySqlSessionTemplate().update(NAMESPACE + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public int updateByPrimaryKey(Privilege record) {
        return this.getMySqlSessionTemplate().update(NAMESPACE + ".updateByPrimaryKey", record);
    }
}
