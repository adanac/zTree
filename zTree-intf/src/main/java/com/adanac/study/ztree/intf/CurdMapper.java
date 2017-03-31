package com.adanac.study.ztree.intf;

import com.adanac.study.ztree.bean.ZTree;

import java.util.List;

/**
 * Created by allen on 2017/3/22.
 */
public interface CurdMapper {
    List<ZTree> list();
    int insert(ZTree zTree);
    ZTree get(Long id);
    int update(ZTree zTree);
    int delete(Integer id);
}
