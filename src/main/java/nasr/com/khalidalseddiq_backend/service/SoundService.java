package nasr.com.khalidalseddiq_backend.service;

import nasr.com.khalidalseddiq_backend.doa.SoundRepository;
import nasr.com.khalidalseddiq_backend.dto.BookDto;
import nasr.com.khalidalseddiq_backend.entity.Book;
import nasr.com.khalidalseddiq_backend.entity.Sound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoundService {

    @Autowired
    SoundRepository soundRepository;
    public ResponseEntity<String> AddSound(Sound sound) {
        soundRepository.save(sound);
        return new ResponseEntity<String>("success",HttpStatus.CREATED );

    }
/*
    public ResponseEntity<Book> getSoundById(Integer id) {
    }

    public ResponseEntity<List<Book>> getAllSounds() {
    }

    public ResponseEntity<String> updateSound(Book book, Integer id) {
    }

    public ResponseEntity<String> DeleteSound(Integer id) {
    }*/
}
