package com.service;

import com.beans.BookNotes;
import com.dao.BookNotesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookNotesService {

    @Autowired
    private BookNotesDao bookNotesDao;

    public List<BookNotes> getAllBookNotes() {
        return bookNotesDao.findAll();
    }

    public BookNotes getBookNoteById(int id) {
        return bookNotesDao.findById(id).orElse(null);
    }

    public BookNotes saveBookNote(BookNotes bookNote) {
        return bookNotesDao.save(bookNote);
    }

    public void deleteBookNoteById(int id) {
        bookNotesDao.deleteById(id);
    }

    public List<BookNotes> getNotesByBookId(int bookId) {
        return bookNotesDao.findByBookId(bookId);
    }
}
