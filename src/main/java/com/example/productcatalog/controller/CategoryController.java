package com.example.productcatalog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;
    public List<Category> getAllCategories(){
    return categoryService.getAllCategories();
    }
}
