package com.example.library.data;

import java.util.List;
import com.example.library.Book;

public interface BookRepository {
    List<Book> findAll();
    Book findById(Long id);
    Book add(Book book);
}
