package com.example.library.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.example.library.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcBookRepository implements BookRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcBookRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Book> findAll() {
        return jdbc.query("select id, author, title, genre, available, deleted from book where " +
                "available = true and deleted = false",
            this::mapRowToBook);
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public Book add(Book book) {
        return null;
    }

    private Book mapRowToBook(ResultSet rs, int rowNum)
        throws SQLException {
        return new Book(
            rs.getLong("id"),
            rs.getString("author"),
            rs.getString("title"),
            rs.getString("genre"),
            rs.getBoolean("available"),
            rs.getBoolean("deleted"));

    }
}
