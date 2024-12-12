package com.service;

import com.beans.Categories;
import com.dao.CategoriesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesDao categoriesDao;

    public List<Categories> getAllCategories() {
        return categoriesDao.findAll();
    }

    public Categories getCategoryById(int id) {
        return categoriesDao.findById(id).orElse(null);
    }

    public Categories saveCategory(Categories category) {
        return categoriesDao.save(category);
    }

    public void deleteCategoryById(int id) {
        categoriesDao.deleteById(id);
    }
}
