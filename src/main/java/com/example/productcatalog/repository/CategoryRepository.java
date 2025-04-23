package com.example.productcatalog.repository;

import com.ecom.productcatalog.model.Category;
import org.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends jpaRepository<Category, Long> {
}
