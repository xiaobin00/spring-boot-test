package com.admin.controller;

import com.admin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/3/14.
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String id){
        return testService.hiService(id);
    }
}
