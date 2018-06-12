package com.wh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
// 熔断注解
@EnableCircuitBreaker
// 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@EnableTransactionManagement
public class WhUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhUserApplication.class, args);
    }

}
