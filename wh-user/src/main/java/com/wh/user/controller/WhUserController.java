package com.wh.user.controller;

import com.wh.user.service.WhUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/3/20.
 */
@RestController
public class WhUserController {
    @Autowired
    private WhUserService userService;

    @RequestMapping("/getuserbyid")
    public Object getUser(@RequestParam("id") Object id) {
        return userService.getUserInfo(id);
    }
}
