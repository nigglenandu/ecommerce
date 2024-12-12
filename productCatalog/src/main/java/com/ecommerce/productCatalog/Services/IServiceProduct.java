package com.ecommerce.productCatalog.Services;

import com.ecommerce.productCatalog.Entity.Product;

import java.util.List;

public interface IServiceProduct {
   List<Product> getAllProducts();

   List<Product> getProductsByCategory(Long categoryId);
}
