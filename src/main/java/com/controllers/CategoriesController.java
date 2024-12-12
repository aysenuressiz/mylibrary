package com.controllers;

import com.beans.Categories;
import com.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    // Yeni kategori ekleme
    @PostMapping("/add")
    public Categories addCategory(@RequestBody Categories category) {
        return categoriesService.saveCategory(category);
    }

    // Tüm kategorileri listeleme
    @GetMapping("/list")
    public List<Categories> getAllCategories() {
        return categoriesService.getAllCategories();
    }

    // Kategoriyi ID'ye göre bulma
    @GetMapping("/{id}")
    public Categories getCategoryById(@PathVariable int id) {
        return categoriesService.getCategoryById(id);
    }
}
