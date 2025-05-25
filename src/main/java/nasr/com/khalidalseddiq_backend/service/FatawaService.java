package nasr.com.khalidalseddiq_backend.service;

import nasr.com.khalidalseddiq_backend.doa.FatawaRepository;
import nasr.com.khalidalseddiq_backend.dto.FatawaDto;
import nasr.com.khalidalseddiq_backend.entity.Fatawa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FatawaService {

    @Autowired
    FatawaRepository fatawaRepository;
    public ResponseEntity<Fatawa> AddFatawa(FatawaDto fatawaDto) {
        Fatawa newFatawa = new Fatawa();
        newFatawa.setTitle(fatawaDto.getTitle());
        newFatawa.setQuestion(fatawaDto.getQuestion());
        newFatawa.setAnswer(fatawaDto.getAnswer());
        fatawaRepository.save(newFatawa);
        return new ResponseEntity<>(newFatawa, HttpStatus.CREATED);
    }
}
