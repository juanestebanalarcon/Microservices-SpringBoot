package com.jeam.app.microservicios.productos.repository;

import com.jeam.app.microservicios.productos.models.ProductoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<ProductoEntity,Long> {

}
