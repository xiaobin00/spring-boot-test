package com.zp.client.controller;

import com.zp.client.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/3/18.
 */
@RestController
public class GetController {

    @Autowired
    private GetService getService;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return getService.getTest();
    }
}
