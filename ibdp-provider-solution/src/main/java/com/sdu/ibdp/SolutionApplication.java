package com.sdu.ibdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SolutionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SolutionApplication.class);
    }
}
