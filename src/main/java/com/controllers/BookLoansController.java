package com.controllers;

import com.beans.BookLoans;
import com.service.BookLoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book-loans")
public class BookLoansController {

    @Autowired
    private BookLoansService bookLoansService;

    // Yeni ödünç alma kaydı oluşturma
    @PostMapping("/add")
    public BookLoans addLoan(@RequestBody BookLoans bookLoan) {
        return bookLoansService.saveLoan(bookLoan);
    }

    // Tüm ödünç alma kayıtlarını listeleme
    @GetMapping("/list")
    public List<BookLoans> getAllLoans() {
        return bookLoansService.getAllLoans();
    }
}
