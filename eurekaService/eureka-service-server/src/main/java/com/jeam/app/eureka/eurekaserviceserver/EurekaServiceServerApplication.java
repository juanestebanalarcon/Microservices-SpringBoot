package com.jeam.app.eureka.eurekaserviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceServerApplication.class, args);
    }

}
