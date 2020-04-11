package com.third;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboProviderApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class,args);
    }
}
