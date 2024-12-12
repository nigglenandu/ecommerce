package com.ecommerce.productCatalog.Services;

import com.ecommerce.productCatalog.Entity.Category;
import com.ecommerce.productCatalog.Repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategoryImpl implements IServiceCategory {
    @Autowired
    private CategoryRepository Repository;

    public List<Category> getAllCategories(){
        return Repository.findAll();
    }
}
