package com.github.devlucasjava.repository;

import com.github.devlucasjava.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, String> {
}
