package com.ecommerce.productCatalog.Controller;

import com.ecommerce.productCatalog.Entity.Category;
import com.ecommerce.productCatalog.Services.IServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private IServiceCategory serviceCategory;

    @GetMapping()
    public List<Category> categories(){
        return serviceCategory.getAllCategories();
    }
}
