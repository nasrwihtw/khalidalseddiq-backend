package nasr.com.khalidalseddiq_backend.service;

import nasr.com.khalidalseddiq_backend.doa.BookRepository;
import nasr.com.khalidalseddiq_backend.dto.BookDto;
import nasr.com.khalidalseddiq_backend.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public ResponseEntity<Book> AddBook(BookDto bookDto) {
        Book newBook = new Book();
        newBook.setTitle(bookDto.getTitle());
        newBook.setImageUrl(bookDto.getImageUrl());
        bookRepository.save(newBook);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }
}
