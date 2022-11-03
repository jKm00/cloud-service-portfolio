package no.ntnu.idata2502.portfolioapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

  @GetMapping("/version")
  public String version() {
    return "version 1.0";
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello World!";
  }
}
