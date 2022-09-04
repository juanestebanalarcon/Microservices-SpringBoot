package com.jeam.itemmicroservice.app.item_microservice.controllers;

import com.jeam.itemmicroservice.app.item_microservice.models.Item;
import com.jeam.itemmicroservice.app.item_microservice.services.IitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    @Qualifier("ItemServiceFeign")
    IitemService itemService;

    @GetMapping("/items/getAllItems")
    public List<Item> getAllItems() {
        return itemService.findAll();
    }
    @GetMapping("/item/{id}")
    public Item getItemById(@PathVariable Long id, @RequestBody Integer amount) {
        return itemService.findById(id,amount);

    }
}
