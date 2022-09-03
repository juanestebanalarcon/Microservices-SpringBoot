package com.jeam.itemmicroservice.app.item_microservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Producto producto;
    private Integer amount;
}
