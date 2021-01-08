package com.yss.study.controller;

import com.yss.study.entity.User;
import com.yss.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 包名称：com.yss.study.controller
 * 类名称：${TYPE_NAME}
 * 类描述：${TODO}
 * 创建人：@author zhouyangyang
 * 创建时间：@date 2020/12/31  13:26
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/getUserById"}, method = RequestMethod.GET)
    public Map<String, Object> getUserById(int id){
        Map<String,Object> map = new HashMap<>(16);

        /**
         *从数据库中获取数值
         */
        User user = userService.getUserById(id);
        if (user != null){
            map.put("success", true);
            map.put("user", user);
        } else {
            map.put("false", false);
        }
        System.out.println("userNumber:"+id);
        System.out.println("user:"+userService.getUserById(id));
        return map;
    }
}
