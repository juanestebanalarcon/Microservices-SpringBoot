package com.jeam.app.microservicios.productos.controllers;

import com.jeam.app.microservicios.productos.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.jeam.app.microservicios.productos.models.ProductoEntity
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private Environment environment;
    @Value("${server.port}")
    private int port;
    Autowired
    private IProductoService service;

    @GetMapping("/getAllProductos")
    public List<ProductoEntity> ReadAllProductos(){
        return service.findAll();
    }
    @GetMapping("/getProduct/{id}")
    public ProductoEntity ReadProduct(@PathVariable Long id) throws InterruptedException {
        ProductoEntity producto = service.findById(id);
      //  producto.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        producto.setPort(port);
        Thread.sleep(2000L);
        return producto;
    }
}
