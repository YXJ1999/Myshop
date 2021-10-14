package com.yang.myshop.controller;

import com.yang.myshop.pojo.User;
import com.yang.myshop.service.UserSerivce;
import com.yang.myshop.service.imp.UserSerivceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserSerivce userSerivceImp;
    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> userSignin(@RequestParam("loginId")String loginId, @RequestParam("password")String password){
        HashMap<String, Object> map=new HashMap<>();
        User user=userSerivceImp.loginUser(loginId, password);
        map.put("userId",user.getUserId());
        map.put("userName",user.getUserName());
        return map;
    }

}
