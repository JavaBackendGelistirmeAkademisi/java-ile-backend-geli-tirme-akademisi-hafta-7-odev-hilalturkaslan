package com.example.freelancer_matching_platform.service;

import com.example.freelancer_matching_platform.model.Category;
import com.example.freelancer_matching_platform.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category category) {
        Optional<Category> existingCategory = categoryRepository.findById(id);
        if (existingCategory.isPresent()) {
            existingCategory.get().setName(category.getName());
            return categoryRepository.save(existingCategory.get());
        }
        return null;
    }


    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }


    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}












