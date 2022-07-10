package com.demo.service.impl;

import com.demo.common.CreateDate;
import com.demo.common.CreateUUId;
import com.demo.dao.TabUserDao;
import com.demo.pojo.TabUser;
import com.demo.service.TabUserService;
import javafx.scene.control.Tab;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("TabUserService")
public class TabUserServiceImpl implements TabUserService {
@Resource
private TabUserDao dao;
    @Override
    public void findAll(HttpServletRequest request) {
     List<TabUser> list= dao.findAll();
     request.setAttribute("list",list);
    }

    @Override
    public void add(TabUser user,HttpServletRequest request) {
        user.setId(CreateUUId.getUUId() );
       user.setStat("1");
       user.setCreatename("lemon");
       user.setUpdatename("lemon");
       user.setCreatetime(CreateDate.getDate());
       user.setUpdatetime(CreateDate.getDateHHMM());
       dao.add(user);
    }

    @Override
    public void delete(String id) {
        dao.delete(id);
    }

    @Override
    public void findbyid(String id,HttpServletRequest request) {
        TabUser user= dao.findbyid(id);
        request.setAttribute("user",user);

    }

    @Override
    public void update(TabUser user, HttpServletRequest request) {
        dao.update(user);

    }

    @Override
    public void updateopen(String id) {
        dao.updateopen(id);
    }

    @Override
    public void updateclose(String id) {
dao.updateclose(id);
    }


}
