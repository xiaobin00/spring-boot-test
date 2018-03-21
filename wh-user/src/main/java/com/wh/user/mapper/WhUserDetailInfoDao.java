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


}
