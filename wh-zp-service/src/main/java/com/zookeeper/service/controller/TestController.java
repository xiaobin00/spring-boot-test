package com.zookeeper.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/3/18.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public Object test(){
        return "test";
    }
}
