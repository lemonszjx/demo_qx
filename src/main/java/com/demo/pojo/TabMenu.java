package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TabMenu {
    private String id;
    private String menuname;
    private String  uri;
    private String flag;
    private String stat;
    private String createtime;
    private String createname;
    private String updatename;
    private String updatetime;
}
