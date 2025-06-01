package nasr.com.khalidalseddiq_backend.service;

import nasr.com.khalidalseddiq_backend.doa.BookRepository;
import nasr.com.khalidalseddiq_backend.dto.BookDto;
import nasr.com.khalidalseddiq_backend.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public ResponseEntity<String> AddBook(BookDto bookDto) {
        Book newBook = new Book();
        newBook.setTitle(bookDto.getTitle());
        newBook.setImageUrl(bookDto.getImageUrl());
        bookRepository.save(newBook);
        return new ResponseEntity<String>("Success", HttpStatus.CREATED);
    }


    public ResponseEntity<Book> getBookById(Integer id) {
       Optional<Book> book =  bookRepository.findById(id);
        if (book.isPresent()){
            return ResponseEntity.ok(book.get());

//            Book entity = book.get();
//            BookDto bookDto = new BookDto(entity.getTitle(), entity.getImageUrl());
//            return ResponseEntity.ok(bookDto);




        }else {
           return  ResponseEntity.notFound().build();
        }

     /*   return bookRepository.findById(id)
                .map(book -> ResponseEntity.ok(book))
                .orElse(ResponseEntity.notFound().build());*/
    }

    public ResponseEntity<List<Book>> getAllBooks() {

        List<Book> books =  bookRepository.findAll();

        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);

    }


    public ResponseEntity<String> updateBook(Book book, Integer id) {
        Optional<Book> updateBook  = bookRepository.findById(id);

        if(updateBook.isPresent()){
            Book exisitingBook = updateBook.get();

            exisitingBook.setTitle(book.getTitle());
            exisitingBook.setImageUrl(book.getImageUrl());

            bookRepository.save(exisitingBook);

            return new ResponseEntity<String>("Success", HttpStatus.CREATED);

        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<String> DeleteBooks(Integer id) {
        Optional<Book> deleteBook  = bookRepository.findById(id);

        if(deleteBook.isPresent()){
            bookRepository.deleteById(id);

            return new ResponseEntity<String>("Success", HttpStatus.OK);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
