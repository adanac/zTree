package com.adanac.study.common.intf.impl;

import com.adanac.study.common.intf.BaseDao;
import com.raycloud.cobarclient.mybatis.spring.MySqlSessionTemplate;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Copyright: 2016 Haiziwang
 * *
 * Author:  fzLiu
 * Date:    2016年12月28日
 * Desc:    调用Mybatis的增删改查服务
 */
public abstract class BaseDaoSupport<Entity extends Serializable, PrimaryKey> implements BaseDao<Entity, PrimaryKey> {

	private String selectByPrimaryKey = null;
	private String deleteByPrimaryKey = null;
	private String insert = null;
	private String insertSelective = null;
	private String updateByPrimaryKeySelective = null;
	private String updateByPrimaryKey = null;

	/**
	 * MyBatis Mapper 的命名空间
	 */
	private final String nameSpace;

	@Resource
	private MySqlSessionTemplate sessionTemplate;

	/**
	 * 使子类可以访问 sqlMapClientTemplate
	 */
	public MySqlSessionTemplate getMySqlSessionTemplate() {
		return sessionTemplate;
	}

	/**
	 * 构造函数
	 *
	 * @param nameSpace Mybatis Mapper 的命名空间
	 */
	public BaseDaoSupport(String nameSpace) {
		this.nameSpace = nameSpace;
		this.selectByPrimaryKey = nameSpace + ".selectByPrimaryKey";
		this.deleteByPrimaryKey = nameSpace + ".deleteByPrimaryKey";
		this.insert = nameSpace + ".insert";
		this.insertSelective = nameSpace + ".insertSelective";
		this.updateByPrimaryKeySelective = nameSpace + ".updateByPrimaryKeySelective";
		this.updateByPrimaryKey = nameSpace + ".updateByPrimaryKey";
	}

	/**
	 * 根据主键查询
	 *
	 * @param id 主键
	 * @return 查询到的结果
	 */
	@Override
	public Entity selectByPrimaryKey(PrimaryKey id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pk", id);
		return (Entity) sessionTemplate.selectOne(selectByPrimaryKey, params);
	}

	/**
	 * 根据主键删除记录
	 *
	 * @param id 主键
	 * @return 删除的记录数
	 */
	@Override
	public int deleteByPrimaryKey(PrimaryKey id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pk", id);
		return sessionTemplate.delete(deleteByPrimaryKey, params);
	}

	/**
	 * 插入记录
	 *
	 * @param record 待插入记录
	 * @return 成功插入实体的个数
	 */
	@Override
	public int insert(Entity record) {
		return sessionTemplate.insert(insert, record);
	}

	/**
	 * 插入记录，并跳过空属性
	 *
	 * @param record 待插入记录
	 * @return 成功插入实体的个数
	 */
	@Override
	public int insertSelective(Entity record) {
		return sessionTemplate.insert(insertSelective, record);
	}

	/**
	 * 通过主键更新
	 *
	 * @param record 待更新记录
	 * @return 成功更新实体的个数
	 */
	@Override
	public int updateByPrimaryKey(Entity record) {
		return sessionTemplate.update(updateByPrimaryKey, record);
	}

	/**
	 * 通过主键更新，并跳过空属性
	 *
	 * @param record 待更新记录
	 * @return 成功更新实体的个数
	 */
	@Override
	public int updateByPrimaryKeySelective(Entity record) {
		return sessionTemplate.update(updateByPrimaryKeySelective, record);
	}
}
