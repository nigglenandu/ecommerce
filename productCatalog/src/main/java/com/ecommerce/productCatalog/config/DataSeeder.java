package com.ecommerce.productCatalog.config;

import com.ecommerce.productCatalog.Entity.Category;
import com.ecommerce.productCatalog.Entity.Product;
import com.ecommerce.productCatalog.Repo.CategoryRepository;
import com.ecommerce.productCatalog.Repo.ProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // create categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, home));

        // create products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest model smartphone with amazing features");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for work and play");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter");
        jacket.setDescription("Warm and cozy jacket for winter.");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High speed blender for smoothies and more.");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(699.99);
        blender.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone, laptop, jacket, blender));
    }
}
