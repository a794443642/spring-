package com.wcj.dao.impl;

import com.wcj.dao.WcjDao;
import com.wcj.entity.WcjUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class WcjDaoImpl implements WcjDao {
    private List<WcjUser> users = new ArrayList<WcjUser>();
    public WcjDaoImpl(){
     users.add(new WcjUser("001","张三","精通java kotlin python go各种语言的拼写"));
     users.add(new WcjUser("002","李四","精通java kotlin python go各种语言的拼写"));
     users.add(new WcjUser("003","王五","精通java kotlin python go各种语言的拼写"));
     users.add(new WcjUser("003","马六","精通java kotlin python go各种语言的拼写"));
    }

    public List<WcjUser> getList() {
        return users;
    }

    public WcjUser getOneById(String id) {
        for (WcjUser user : users) {
            if(id.equals(user.getId())){
                return user;
            }
        }
        return null;
    }

    public WcjUser getOnebyName(String name) {
        for (WcjUser user : users) {
            if(name.equals(user.getName())){
                return user;
            }
        }
        return null;
    }
}
