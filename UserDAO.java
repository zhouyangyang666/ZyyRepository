package com.yss.study.dao;

import com.yss.study.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 包名称：com.yss.study.dao
 * 类名称：${TYPE_NAME}
 * 类描述：${TODO}
 * 创建人：@author zhouyangyang
 * 创建时间：@date 2020/12/31  9:35
 */
@Repository
public interface UserDAO {

    User getUserById(int id);
}
