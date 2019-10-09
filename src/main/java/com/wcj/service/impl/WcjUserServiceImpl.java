package com.wcj.service.impl;

import com.wcj.dao.WcjDao;
import com.wcj.entity.WcjUser;
import com.wcj.service.WcjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WcjUserServiceImpl implements WcjUserService {
    @Autowired
    private WcjDao wcjDao;
    @Override
    public List getall() {
        return wcjDao.getList();
    }

    @Override
    public WcjUser getbyId(String id) {
        return wcjDao.getOneById(id);
    }

    @Override
    public WcjUser getbyName(String name) {
        return wcjDao.getOnebyName(name);
    }
}
