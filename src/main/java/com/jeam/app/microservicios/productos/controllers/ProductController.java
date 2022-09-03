package com.jeam.app.microservicios.productos.controllers;

import com.jeam.app.microservicios.productos.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jeam.app.microservicios.productos.models.ProductoEntity
import java.util.List;
@RestController
public class ProductController {

    @Autowired
    private IProductoService service;

    @GetMapping("/getAllProductos")
    public List<ProductoEntity> ReadAllProductos(){
        return service.findAll();
    }
    @GetMapping("/getProduct/{id}")
    public ProductoEntity ReadProduct(@PathVariable("id") Long id){
        return service.findById(id);
    }
}
