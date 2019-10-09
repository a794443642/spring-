package com.wcj.dao;

import com.wcj.entity.WcjUser;

import java.util.List;

public interface WcjDao {
     List<WcjUser> getList();
     WcjUser getOneById(String id);
     WcjUser getOnebyName(String name);
}
