package com.adanac.study.ztree.intf;


import com.adanac.study.ztree.bean.Privilege;

public interface PrivilegeMapper {



    /**
     *
     * @mbggenerated
     */
    int insert(Privilege record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Privilege record);


    /**
     *根据某个字段查询
     * @param privilege
     * @return
     */
    Privilege selectOneByCode(Privilege privilege);

    /**
     * 根据某个字段删除
     * @param privilege
     * @return
     */
    int deleteByCode(Privilege privilege);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Privilege record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Privilege record);
}