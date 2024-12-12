package com.dao;

import com.beans.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsDao extends JpaRepository<Authors, Integer> {
    // Yazar özel sorguları burada tanımlanabilir.
}
