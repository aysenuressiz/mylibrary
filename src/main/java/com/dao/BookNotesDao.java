package com.dao;

import com.beans.BookNotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookNotesDao extends JpaRepository<BookNotes, Integer> {
    // Örneğin, bir kitaba ait tüm notları listeleme
    List<BookNotes> findByBookId(int bookId);
}
