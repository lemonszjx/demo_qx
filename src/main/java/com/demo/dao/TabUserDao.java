package com.demo.dao;

import com.demo.pojo.TabUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TabUserDao {
    public List<TabUser> findAll();
    public void add(TabUser user);
    public  void delete(String id);
    public TabUser findbyid(String id);
    public void update(TabUser user);
    public void updateopen(String id);
    public void updateclose(String id);
}
