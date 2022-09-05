package com.jeam.app.microservicios.productos.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="productos")
public class ProductoEntity implements Serializable {

    @Transient
    private Integer port;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String productName;
    private String productDescription;
    private String productPrice;
    @Column(name = "createdAt")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}
