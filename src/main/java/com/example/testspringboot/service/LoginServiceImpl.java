package com.example.testspringboot.service;

import com.example.testspringboot.dao.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    @Override
    public String Login(String username,String password) {
        String password_mysql = loginMapper.findPassword(username);
       // System.out.println("password_mysql="+password_mysql);
        //System.out.println("password="+password);
        if(password_mysql !=null && password.equals(password_mysql)){

            return "true";
        }else {
            return "false";
        }
    }
}
