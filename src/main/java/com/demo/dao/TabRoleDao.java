package com.demo.dao;

import com.demo.pojo.TabRole;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface TabRoleDao {

    public List<TabRole> findall();
    public void add(TabRole role);
    public void delete(String id);
    public TabRole findbyid(String id);
    public void update(TabRole role);
    List<TabRole> select_check_role_view();
}
