package com.mysite.sbb;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Connection_test {
    @GetMapping(value = "/hello")
    public ResponseEntity<String> fromBackend(){

        return ResponseEntity.ok("Connection test succeeded");
    }
    @GetMapping(value = "/")
    public ResponseEntity<String> root(){
        return ResponseEntity.ok("Welcome to root page. <br>All Connection set RDY TO GO!");
    }
}
