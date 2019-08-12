package com.dodofly.registrationcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@EnableEurekaServer
@Slf4j
@SpringBootApplication
public class RegistrationCenterApplication {
    //http://localhost:1111/ 注册地址
    public static void main(String[] args) {
        log.info("==================RegistrationCenterApplication start .......======================");
        SpringApplication.run(RegistrationCenterApplication.class, args);
        log.info("==================RegistrationCenterApplication start success======================");
    }

}
