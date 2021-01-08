package com.yss.study.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

/**
 * 包名称：com.yss.study.entity
 * 类名称：${TYPE_NAME}
 * 类描述：${TODO}
 * 创建人：@author zhouyangyang
 * 创建时间：@date 2020/12/31  9:33
 */
@ToString
@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String password;

}
