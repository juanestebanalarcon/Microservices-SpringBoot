package com.jeam.itemmicroservice.app.item_microservice.services;

import com.jeam.itemmicroservice.app.item_microservice.models.Item;
import com.jeam.itemmicroservice.app.item_microservice.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements IitemService{

    @Autowired
    private RestTemplate RestClient;
    @Override
    public List<Item> findAll() {
        List<Producto>productos = Arrays.asList(RestClient.getForObject("http://localhost:8001/getAllProductos",Producto[].class));
        return  productos.stream().map(p->new Item(p,1)).collect(Collectors.toList());;
    }

    @Override
    public Item findById(Long id, Integer amount) {
        Map<String,String>pathVariables = new HashMap<String,String>();
        pathVariables.put("id",id.toString());
        Producto producto =RestClient.getForObject("http://localhost:8001/getProduct/{id}",Producto.class,pathVariables);

        return new Item(producto, amount);
    }
}