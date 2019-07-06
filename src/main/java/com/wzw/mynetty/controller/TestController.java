package com.wzw.mynetty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Joker_wang
 * @Date: 2019/6/21 0:38
 * @Version 1.0.0
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {



    /*@RequestMapping("/send")
    public void sendMsg() {
        System.err.println("send Msg....");
        eventListennter.sendAllUser();
    }*/

    @RequestMapping("/send")
    public void sendMsg() {
        System.err.println("send Msg12....");
        //eventListennter.sendAllUser();
    }
}
