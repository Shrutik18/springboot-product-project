package com.api.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Product;
import com.api.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
    @Override
    public List<Product> fetchProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> fetchProductById(Integer productId) {
        return productRepository.findById(productId);
    }

    @Override
    public Product updateProduct(Integer productId, Product product) {
        Product updatedProduct=productRepository.findById(productId).get();
        if(Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName()))
            updatedProduct.setProductName(product.getProductName());

        if(Objects.nonNull(product.getProductDescription()) && !"".equalsIgnoreCase(product.getProductDescription()))
            updatedProduct.setProductDescription(product.getProductDescription());

        return productRepository.save(updatedProduct);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productRepository.deleteById(productId);
    }
}
