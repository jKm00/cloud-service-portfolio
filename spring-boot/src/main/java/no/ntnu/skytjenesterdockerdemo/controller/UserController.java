package no.ntnu.skytjenesterdockerdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.ntnu.skytjenesterdockerdemo.models.User;
import no.ntnu.skytjenesterdockerdemo.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;
  
  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    return ResponseEntity.ok(this.userService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
    Optional<User> result = this.userService.findById(id);

    if (result.isPresent()) {
      return ResponseEntity.ok().body(result.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
