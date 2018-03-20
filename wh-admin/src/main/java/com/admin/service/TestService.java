package com.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2018/3/14.
 */
@Service
public class TestService
{
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String id) {
        return restTemplate.getForObject("http://WH-USER/getuserbyid?id="+id,String.class);
    }
}
