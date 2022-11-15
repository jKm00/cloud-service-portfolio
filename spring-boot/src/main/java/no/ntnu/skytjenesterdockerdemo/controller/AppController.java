package no.ntnu.skytjenesterdockerdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
  
  @GetMapping("/version")
  public ResponseEntity<String> version() {
    return new ResponseEntity<>("version 1.0", HttpStatus.OK);
  }

  @GetMapping("/hello")
  public ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hello world!", HttpStatus.OK);
  }
}
