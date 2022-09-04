package com.jeam.itemmicroservice.app.item_microservice.controllers;

import com.jeam.itemmicroservice.app.item_microservice.models.Item;
import com.jeam.itemmicroservice.app.item_microservice.services.IitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    IitemService itemService;

    @GetMapping("/items/getAllItems")
    public List<Item> getAllItems() {
        return itemService.findAll();
    }

}
