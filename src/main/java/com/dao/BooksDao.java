package com.dao;

import com.beans.Books;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BooksDao {

    private final JdbcTemplate jdbcTemplate;

    public BooksDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Books> getAllBooks() {
        String sql = "SELECT * FROM Books";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Books book = new Books();
            book.setId(rs.getInt("id"));
            book.setName(rs.getString("name"));
            book.setPages(rs.getInt("pages"));
            book.setIsRead(rs.getBoolean("is_read"));
            book.setIsBorrowed(rs.getBoolean("is_borrowed"));
            return book;
        });
    }

    public void saveBook(Books book) {
        String sql = "INSERT INTO Books (name, pages, is_read, is_borrowed, category_id, author_id) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getName(), book.getPages(), book.getIsRead(), book.getIsBorrowed(), book.getCategoryId(), book.getAuthorId());
    }

    public Books getBookById(int id) {
        String sql = "SELECT * FROM Books WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Books book = new Books();
            book.setId(rs.getInt("id"));
            book.setName(rs.getString("name"));
            book.setPages(rs.getInt("pages"));
            book.setIsRead(rs.getBoolean("is_read"));
            book.setIsBorrowed(rs.getBoolean("is_borrowed"));
            return book;
        });
    }
}
