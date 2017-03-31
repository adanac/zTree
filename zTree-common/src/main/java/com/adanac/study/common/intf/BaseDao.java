package com.adanac.study.common.intf;

import java.io.Serializable;

/**
 * Created by allen on 2017/3/15.
 * 基础 Dao 接口
 */
public interface BaseDao<T extends Serializable, PK> {
    /**
     * 通过主键查询实体
     *
     * @param id 主键
     * @return T 查询到的对象
     */
    T selectByPrimaryKey(PK id);

    /**
     * 通过主键删除实体
     *
     * @param id 主键
     * @return 删除记录的数目
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 插入实体，空属性也会插入
     *
     * @param object 待新增的信息
     * @return 成功插入实体的数目
     */
    int insert(T object);

    /**
     * 插入实体，空属性不会插入
     *
     * @param object 待新增的记录
     * @return 成功插入实体的个数
     */
    int insertSelective(T object);

    /**
     * 根据实体的主键更新实体，空属性也会更新
     *
     * @param object 待更新的记录
     * @return 成功更新实体的个数
     */
    int updateByPrimaryKey(T object);

    /**
     * 根据实体的主键更新实体，空属性不会更新
     *
     * @param object 待更新的记录
     * @return 成功更新实体的个数
     */
    int updateByPrimaryKeySelective(T object);
}
