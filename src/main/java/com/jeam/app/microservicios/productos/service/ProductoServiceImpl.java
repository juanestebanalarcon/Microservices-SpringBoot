package com.jeam.app.microservicios.productos.service;

import com.jeam.app.microservicios.productos.models.ProductoEntity;
import com.jeam.app.microservicios.productos.repository.ProductoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.beans.Transient;
import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoCrudRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<ProductoEntity> findAll() {
        return (List<ProductoEntity>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ProductoEntity findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
