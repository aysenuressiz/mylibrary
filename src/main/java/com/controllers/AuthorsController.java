package com.controllers;

import com.beans.Authors;
import com.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

    @Autowired
    private AuthorsService authorsService;

    // Yeni yazar ekleme
    @PostMapping("/add")
    public Authors addAuthor(@RequestBody Authors author) {
        return authorsService.saveAuthor(author);
    }

    // Tüm yazarları listeleme
    @GetMapping("/list")
    public List<Authors> getAllAuthors() {
        return authorsService.getAllAuthors();
    }

    // Yazarı ID'ye göre bulma
    @GetMapping("/{id}")
    public Authors getAuthorById(@PathVariable int id) {
        return authorsService.getAuthorById(id);
    }
}
