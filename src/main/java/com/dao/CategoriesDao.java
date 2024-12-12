package com.dao;

import com.beans.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesDao extends JpaRepository<Categories, Integer> {
    // Özel sorgular: Örneğin, isme göre kategori bulma
    Categories findByName(String name);
}
