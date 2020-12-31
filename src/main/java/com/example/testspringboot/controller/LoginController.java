package com.example.testspringboot.controller;

import com.example.testspringboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    public static String Login_status;    //登录状态 1112
    @Autowired
    LoginController loginController;
    @Autowired
    LoginService loginService;
    @RequestMapping(value ="/login")
    @ResponseBody
    public String Login(String username,String password){
        String message = loginService.Login(username,password);
        System.out.println(username+password+message);

        if(message.equals("true")){
            Login_status = "true";
        }else {
            Login_status = "false";
        }
        return Login_status;
    }

    @RequestMapping(value ="/check")
    @ResponseBody
    public String Check(String username,String password){
        String message = loginService.Login(username,password);
        System.out.println(username+password+message);
        /*
        if(message.equals("true")){
            return "index";
        }else {
            return "false";
        }*/
        return message;
    }
    @RequestMapping("/true")
    public String Index(String key){
        if(Login_status!=null&&Login_status.equals(key)){
            return "true";
        }else {
            return "false";
        }
    }

}
