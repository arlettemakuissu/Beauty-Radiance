package com.eclat_beaute.shop.repository;

import com.eclat_beaute.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Integer, Product> {

}
