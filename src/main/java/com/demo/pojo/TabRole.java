package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TabRole {
    private  String id;
    private String rolename;
    private String contents;
    private String stat;
    private String createname;
    private String createtime;
    private String updatename;
    private String usersid;
    private String updatetime;
}
