package com.demo.service.impl;

import com.demo.common.CreateDate;
import com.demo.common.CreateUUId;
import com.demo.dao.TabRoleDao;
import com.demo.pojo.TabRole;
import com.demo.service.TabRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("TabRoleService")
public class TabRoleServiceImpl implements TabRoleService {
@Resource
private TabRoleDao dao;
    @Override
    public void findall(HttpServletRequest request) {
        List<TabRole> list= dao.findall();
        request.setAttribute("list",list);

    }

    @Override
    public void add(TabRole role,HttpServletRequest request) {
        role.setCreatename("lemon");
        role.setCreatetime(CreateDate.getDate());
        role.setId(CreateUUId.getUUId());
        dao.add(role);
    }

    @Override
    public void delete(String id) {
        dao.delete(id);
    }

    @Override
    public void findbyid(String id,HttpServletRequest request) {
       TabRole role= dao.findbyid(id);
       request.setAttribute("role",role);
    }

    @Override
    public void update(TabRole role,HttpServletRequest request) {
role.setCreatename("lemon");
role.setUpdatename("lemon");
role.setCreatetime(CreateDate.getDate());
role.setUpdatetime(CreateDate.getDateHHMM());
role.setStat("1");
dao.update(role);
    }
    @Override
    public void select_check_role_view(String userid, HttpServletRequest request) {
        List<TabRole> list=dao.select_check_role_view();
        request.setAttribute("list",list);
        request.setAttribute("userid",userid);
    }
}
