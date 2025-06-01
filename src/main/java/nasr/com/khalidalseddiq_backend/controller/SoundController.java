package nasr.com.khalidalseddiq_backend.controller;


import nasr.com.khalidalseddiq_backend.dto.BookDto;
import nasr.com.khalidalseddiq_backend.entity.Book;
import nasr.com.khalidalseddiq_backend.entity.Sound;
import nasr.com.khalidalseddiq_backend.service.BookService;
import nasr.com.khalidalseddiq_backend.service.SoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sounds")
public class SoundController {
    @Autowired
    SoundService bookService;

    @PostMapping("post")
    public ResponseEntity<String> addBook(@RequestBody Sound sound){
        return bookService.AddSound(sound);
    }
/*
    @GetMapping("get/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Integer id){
        return bookService.getSoundById(id);
    }

    @GetMapping("get/sounds")
    public ResponseEntity<List<Book>> getBooks(){
        return bookService.getAllSounds();
    }

    @PutMapping("update/{id}")
    public ResponseEntity<String> updateBooks(@RequestBody Book book, @PathVariable Integer id ){
        return bookService.updateSound(book, id );
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> DeleteBooks(@PathVariable Integer id ){
        return bookService.DeleteSound(id);
    }*/

}
