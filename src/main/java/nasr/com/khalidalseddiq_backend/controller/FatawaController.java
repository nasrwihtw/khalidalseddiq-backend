package nasr.com.khalidalseddiq_backend.controller;


import nasr.com.khalidalseddiq_backend.doa.FatawaRepository;
import nasr.com.khalidalseddiq_backend.dto.FatawaDto;
import nasr.com.khalidalseddiq_backend.entity.Fatawa;
import nasr.com.khalidalseddiq_backend.service.FatawaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping("fatawa")
public class FatawaController {


    @Autowired
    FatawaService fatawaService;

    @PostMapping("post")
    public ResponseEntity<Fatawa> addFatawa(@RequestBody FatawaDto fatawaDto){
        return fatawaService.AddFatawa(fatawaDto);
    }
}
