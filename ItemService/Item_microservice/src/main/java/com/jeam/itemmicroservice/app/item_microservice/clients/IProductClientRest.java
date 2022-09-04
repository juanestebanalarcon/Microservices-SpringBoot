package com.jeam.itemmicroservice.app.item_microservice.clients;

import com.jeam.itemmicroservice.app.item_microservice.models.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "servicio-productos")
public interface IProductClientRest {
    @GetMapping("/getAllProductos")
    public List<Producto> ReadAllProductos();
    @GetMapping("/getProduct/{id}")
    public Producto ReadProduct(@PathVariable Long id);
}
