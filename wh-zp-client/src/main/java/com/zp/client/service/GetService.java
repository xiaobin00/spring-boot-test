package com.zp.client.service;

import com.zp.client.component.GetServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2018/3/18.
 */
@Component
@FeignClient(value="server",fallback=GetServiceHystrix.class)
public interface GetService {

    @RequestMapping(method = RequestMethod.POST, value = "/test")
    public String getTest();
}
