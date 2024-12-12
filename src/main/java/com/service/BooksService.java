package com.service;

import com.beans.Books;
import com.dao.BooksDao;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BooksService {

    private final BooksDao bookDao;

    public BooksService(BooksDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Books> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public Books getBookById(int id) {
        return bookDao.getBookById(id);
    }

    public void addBook(Books book) {
        bookDao.saveBook(book);
    }
}
