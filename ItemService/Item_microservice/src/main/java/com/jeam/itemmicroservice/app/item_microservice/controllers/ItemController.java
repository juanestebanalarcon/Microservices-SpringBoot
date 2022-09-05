package com.jeam.itemmicroservice.app.item_microservice.controllers;

import com.jeam.itemmicroservice.app.item_microservice.models.Item;
import com.jeam.itemmicroservice.app.item_microservice.models.Producto;
import com.jeam.itemmicroservice.app.item_microservice.services.IitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    @Qualifier("serviceRestTemplate")
    IitemService itemService;

    @GetMapping("/items/getAllItems")
    public List<Item> getAllItems() {
        return itemService.findAll();
    }
//    @HystrixCommand(fallbackMethod = "alternativeMethod")
    @GetMapping("/item/{id}")
    public Item getItemById(@PathVariable Long id, @RequestBody Integer amount) {
        return itemService.findById(id,amount);

    }
    public Item alternativeMethod(Long id, Integer amount){
        Item item =new Item();
        Producto producto=new Producto();
        item.setAmount(amount);
        item.setId(id);
        producto.setProductName("Cámara Sony");
        producto.setProductPrice(500.00);
        item.setProducto(producto);
        return item;
    }
}
