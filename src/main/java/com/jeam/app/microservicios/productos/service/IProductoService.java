package com.jeam.app.microservicios.productos.service;

import com.jeam.app.microservicios.productos.models.ProductoEntity;

import java.util.List;

public interface IProductoService {
    public List<ProductoEntity> findAll();
    public ProductoEntity findById(Long id);
}
