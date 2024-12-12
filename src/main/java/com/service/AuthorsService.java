package com.service;

import com.beans.Authors;
import com.dao.AuthorsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsService {

    @Autowired
    private AuthorsDao authorsDao;

    public List<Authors> getAllAuthors() {
        return authorsDao.findAll();
    }

    public Authors getAuthorById(int id) {
        return authorsDao.findById(id).orElse(null);
    }

    public Authors saveAuthor(Authors author) {
        return authorsDao.save(author);
    }

    public void deleteAuthorById(int id) {
        authorsDao.deleteById(id);
    }
}
