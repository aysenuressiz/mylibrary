package com.controllers;

import com.beans.Books;
import com.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BooksController {

    @Autowired
    private BooksService bookService;

    @GetMapping("/home")
    public String showBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "home";
    }

    @GetMapping("/book/{id}")
    public String showBookDetails(@PathVariable int id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        return "bookDetails";
    }

    @GetMapping("/addBook")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new Books());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Books book) {
        bookService.addBook(book);
        return "redirect:/home";
    }
}
