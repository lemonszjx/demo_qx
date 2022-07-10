package com.demo.service;

import com.demo.pojo.TabUser;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Service
public interface TabUserService {
    public void findAll(HttpServletRequest request);
    public void add(TabUser user,HttpServletRequest request);
    public void delete(String id);
    public void findbyid(String id,HttpServletRequest request);
    public void update(TabUser user,HttpServletRequest request);
    public void updateopen(String id);
    public void updateclose(String id);
}
