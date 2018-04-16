package com.wh.user.service.impl;

import com.wh.user.entity.WhUserDetailInfo;
import com.wh.user.mapper.WhUserDetailInfoDao;
import com.wh.user.service.WhUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/3/20.
 */
@Service
public class WhUserServiceImpl implements WhUserService {
    @Autowired
    private WhUserDetailInfoDao userDetailInfoDao;

    @Override
    public WhUserDetailInfo getUserInfo(Object id) {
        return userDetailInfoDao.fetch(id);
    }
}
