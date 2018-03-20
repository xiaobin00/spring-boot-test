package com.wh.user.mapper;


import com.wh.user.entity.WhUserDetailInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Title: 用户详细信息 数据库操作接口
 * Description: 用户详细信息
 * author: zhb
 * time:2017-09-28 10:03:03
 * version 1.0
 */
@Mapper
public interface WhUserDetailInfoDao extends BaseDaoable<WhUserDetailInfo> {

    @Override
    long insert(WhUserDetailInfo var1);

    @Override
    long insertBatch(List<WhUserDetailInfo> var1);

    @Override
    long update(WhUserDetailInfo var1);

    @Override
    long updateMap(Object var1, Object var2);

    @Override
    long deleteByKey(Object var1);

    @Override
    long delete(Object var1);

    @Override
    long deleteBatch(Object var1);

    @Override
    WhUserDetailInfo fetch(Object var1);

    @Override
    long count(Object var1);

    @Override
    List<WhUserDetailInfo> list(Object var1, Sort var2);

    @Override
    List<WhUserDetailInfo> page(PageRequest var1, Object var2);

    @Override
    WhUserDetailInfo query(Object var1);
}
