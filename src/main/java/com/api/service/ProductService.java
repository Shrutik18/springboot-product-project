package com.api.service;

import java.util.List;
import java.util.Optional;

import com.api.entity.Product;

public interface ProductService {

	List<Product> fetchProducts();

    Product saveProduct(Product product);

    Optional<Product> fetchProductById(Integer productId);

    Product updateProduct(Integer productId, Product product);

    void deleteProductById(Integer productId);

}
