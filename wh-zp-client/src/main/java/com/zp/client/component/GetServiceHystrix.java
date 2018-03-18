package com.zp.client.component;

import com.zp.client.service.GetService;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/3/18.
 */
@Component
public class GetServiceHystrix implements GetService {

    @Override
    public String getTest() {
        return "error";
    }
}
