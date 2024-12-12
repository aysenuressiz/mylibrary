package com.service;

import com.beans.BookLoans;
import com.dao.BookLoansDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookLoansService {

    @Autowired
    private BookLoansDao bookLoansDao;

    public List<BookLoans> getAllBookLoans() {
        return bookLoansDao.findAll();
    }

    public BookLoans getBookLoanById(int id) {
        return bookLoansDao.findById(id).orElse(null);
    }

    public BookLoans saveBookLoan(BookLoans bookLoan) {
        return bookLoansDao.save(bookLoan);
    }

    public void deleteBookLoanById(int id) {
        bookLoansDao.deleteById(id);
    }

    public List<BookLoans> getLoansByUserId(int userId) {
        return bookLoansDao.findByUserId(userId);
    }
}
