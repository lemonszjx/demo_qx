package com.demo.service;

import com.demo.pojo.TabRole;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
@Service
public interface TabRoleService {
    public void findall(HttpServletRequest request);
    public void add(TabRole role,HttpServletRequest request);
    public void delete(String  id);
    public void findbyid(String id,HttpServletRequest request);
    public void update(TabRole role,HttpServletRequest request);
   public void select_check_role_view(String userid, HttpServletRequest request);
}
