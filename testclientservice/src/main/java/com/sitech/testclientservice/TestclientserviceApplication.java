package com.sitech.testclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestclientserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestclientserviceApplication.class, args);
    }

}
