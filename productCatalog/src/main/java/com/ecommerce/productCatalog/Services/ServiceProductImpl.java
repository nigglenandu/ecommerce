package com.ecommerce.productCatalog.Services;

import com.ecommerce.productCatalog.Entity.Product;
import com.ecommerce.productCatalog.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProductImpl implements IServiceProduct{
    @Autowired
    private ProductRepository repository;


    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public List<Product> getProductsByCategory(Long categoryId) {
        return repository.findByCategoryId(categoryId);
    }
}
