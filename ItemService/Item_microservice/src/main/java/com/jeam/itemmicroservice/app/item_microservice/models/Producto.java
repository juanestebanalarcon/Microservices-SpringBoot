package com.jeam.itemmicroservice.app.item_microservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Producto {
    private Long id;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Date createdAt;
    private Integer port;

}
