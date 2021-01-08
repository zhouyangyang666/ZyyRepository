package com.yss.study.service.impl;

import com.yss.study.dao.UserDAO;
import com.yss.study.entity.User;
import com.yss.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包名称：com.yss.study.service.impl
 * 类名称：${TYPE_NAME}
 * 类描述：${TODO}
 * 创建人：@author zhouyangyang
 * 创建时间：@date 2020/12/31  13:24
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public User getUserById(int id){
        return  userDAO.getUserById(id);
    }
}
