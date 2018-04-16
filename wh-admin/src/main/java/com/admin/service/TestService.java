package com.admin.service;

import com.admin.compoment.TestServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by admin on 2018/3/14.
 */
@Service
@FeignClient(value = "wh-user", fallback = TestServiceHystrix.class)//设置熔断回退处理类，以及服务提供者
public interface TestService {

    //服务接口
    @RequestMapping(method = RequestMethod.GET, value = "/getuserbyid")
    String getTest(@RequestParam(value = "id") String id);


}
