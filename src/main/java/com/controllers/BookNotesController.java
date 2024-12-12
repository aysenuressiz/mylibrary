package com.controllers;

import com.beans.BookNotes;
import com.service.BookNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book-notes")
public class BookNotesController {

    @Autowired
    private BookNotesService bookNotesService;

    // Yeni not ekleme
    @PostMapping("/add")
    public BookNotes addNote(@RequestBody BookNotes bookNote) {
        return bookNotesService.saveBookNote(bookNote);
    }

    // Tüm notları listeleme
    @GetMapping("/list")
    public List<BookNotes> getAllNotes() {
        return bookNotesService.getAllNotes();
    }
}
