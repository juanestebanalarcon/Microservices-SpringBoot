package com.jeam.itemmicroservice.app.item_microservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private Producto producto;
    private Integer amount;

    public Item(Producto producto, Integer amount) {
        this.producto = producto;
        this.amount = amount;
    }

    public Item() {
    }
    public Double getTotalPrice() {
        return producto.getProductPrice()*amount.doubleValue();
    }
}
