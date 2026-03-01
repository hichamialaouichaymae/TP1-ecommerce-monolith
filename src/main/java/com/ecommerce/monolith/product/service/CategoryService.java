package com.ecommerce.monolith.product.service;

import com.ecommerce.monolith.product.model.Category;
import com.ecommerce.monolith.product.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> getAll() {
        return repository.findAll();
    }

    public Category create(Category category) {
        return repository.save(category);
    }
}