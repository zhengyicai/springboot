package com.zyc.demo.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.zyc.demo.domain.NeoProperties;
import com.zyc.demo.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/9.
 */

@RestController
@RequestMapping("/index")
public class HelloWorldController {


    @Value("${com.neo.title}")
    private String test;
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }


    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明1");
        user.setPassword("xxxx");
        return user;
    }

    @RequestMapping("/getNeo")
    public NeoProperties getNeo() {
        NeoProperties neo=new NeoProperties();
        System.out.print(test+"...........");

        return neo;
    }





}
