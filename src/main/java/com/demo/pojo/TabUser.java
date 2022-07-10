package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TabUser {

    private String id;
    private String loginname;
    private String password;
    private String username;
    private String tel;
    private String createname;
    private String sex;
    private String age;
    private String createtime;
    private String updatename;
    private String updatetime;
    private String stat;
    private String rolename;
    private String roleid;
}
