package com.mysite.sbb;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Connection_test {
    @GetMapping(value = "/hello-front")
    public ResponseEntity<String> fromBackend(){
        return ResponseEntity.ok("Connection test succeeded");
    }
}
