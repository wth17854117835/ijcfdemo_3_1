package com.sitech.testserviceflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestserviceflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestserviceflowApplication.class, args);
    }

}
