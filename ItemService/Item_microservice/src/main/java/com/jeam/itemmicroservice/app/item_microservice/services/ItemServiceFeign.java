package com.jeam.itemmicroservice.app.item_microservice.services;

import com.jeam.itemmicroservice.app.item_microservice.clients.IProductClientRest;
import com.jeam.itemmicroservice.app.item_microservice.models.Item;
import com.jeam.itemmicroservice.app.item_microservice.models.Producto;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("ItemServiceFeign")
@Primary
public class ItemServiceFeign implements IitemService {
    @Autowired
    IProductClientRest clientFeign;

    @Override
    public List<Item> findAll() {
        return clientFeign.ReadAllProductos().stream().map(i ->new Item(i,1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer amount) {
        return new Item(clientFeign.ReadProduct(id), amount);
    }
}
