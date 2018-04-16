package com.admin.compoment;

import com.admin.service.TestService;
import org.springframework.stereotype.Component;

/**
 * 熔断回退处理
 */
@Component
public class TestServiceHystrix implements TestService {
    @Override
    public String getTest(String id) {
        return "error";
    }
}
