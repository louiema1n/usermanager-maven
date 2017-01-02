package com.lm.usermanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lm.usermanager.bean.EasyUIResult;
import com.lm.usermanager.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody       //以json格式返回数据
    public EasyUIResult queryUserList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        EasyUIResult eur =  this.userService.queryUserList(page, rows);
        return eur;
    }
    
}
