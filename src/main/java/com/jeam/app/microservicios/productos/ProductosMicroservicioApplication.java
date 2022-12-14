package com.jeam.app.microservicios.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductosMicroservicioApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProductosMicroservicioApplication.class, args);
    }

}
