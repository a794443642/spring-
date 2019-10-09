package com.wcj.service;

import com.wcj.dao.WcjDao;
import com.wcj.entity.WcjUser;

import java.util.List;

public interface WcjUserService {
    List getall();
    WcjUser getbyId(String id);
    WcjUser getbyName(String name);
}
