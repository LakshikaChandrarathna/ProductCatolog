package com.ecom.productcatalog.service;

import com.ecom.productcatalog.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<category> getAllCategories(){
        return
    }
}
