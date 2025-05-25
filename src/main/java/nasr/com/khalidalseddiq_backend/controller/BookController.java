package nasr.com.khalidalseddiq_backend.controller;


import nasr.com.khalidalseddiq_backend.dto.BookDto;
import nasr.com.khalidalseddiq_backend.entity.Book;
import nasr.com.khalidalseddiq_backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("post")
    public ResponseEntity<Book> addBook(@RequestBody BookDto bookDto){
        return bookService.AddBook(bookDto);
    }
}
