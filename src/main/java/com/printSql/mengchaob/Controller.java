package com.printSql.mengchaob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：mengchao
 * @date ：Created in 2019/10/29 19:11
 * @description：测试Controller
 */
@org.springframework.stereotype.Controller
@RequestMapping("Controller")
public class Controller {
    @Autowired
    private UserDao userDao;
    @RequestMapping("getUser")
    @ResponseBody
    public List getUser(){
        return userDao.getUserInfo();
    }
}
