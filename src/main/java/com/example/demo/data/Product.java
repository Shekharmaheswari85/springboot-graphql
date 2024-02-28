package com.example.demo.data;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCTS")
@Data
public class Product {
    @Id
    @Column(name = "PRODUCT_ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SIZE")
    private int size;

    @Column(name = "VARIETY")
    private int variety;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "STATUS")
    private String status;

}
