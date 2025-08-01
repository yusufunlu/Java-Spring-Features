package com.yusufu.javaspringfeatures.service;

import com.yusufu.javaspringfeatures.model.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> findById(String id);

    //Product save(Product product);
    public Product saveOrUpdate(Product product);

    //Optional<Product> update(String id, Product updatedProduct);

    Product delete(String id);
}
