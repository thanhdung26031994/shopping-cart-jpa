package com.example.shoppingcartjpa.service;

import com.example.shoppingcartjpa.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}
