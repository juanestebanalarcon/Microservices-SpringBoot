package com.jeam.itemmicroservice.app.item_microservice.services;

import com.jeam.itemmicroservice.app.item_microservice.models.Item;

import java.util.List;

public interface IitemService {
    public List<Item> findAll();
    public Item findById(Long id,Integer amount);

}
