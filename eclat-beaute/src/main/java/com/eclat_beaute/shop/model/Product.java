package com.eclat_beaute.shop.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(length = 1000)
    private String description;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String imageUrl;

    @JoinColumn(name = "category_id",nullable = false)
    @ManyToOne
    private String category;

}
