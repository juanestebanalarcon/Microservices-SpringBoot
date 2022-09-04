package com.jeam.itemmicroservice.app.item_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient("servicio-productos")
@EnableFeignClients
@SpringBootApplication
public class ItemMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemMicroserviceApplication.class, args);
    }

}
