package no.ntnu.skytjenesterdockerdemo.modelTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import no.ntnu.skytjenesterdockerdemo.models.User;

@SpringBootTest
public class UserTests {
  @Test
  @DisplayName("Create a valid user")
  void createUser() {
    User user = new User("Joakim Edvardsen");

    assertEquals("Joakim Edvardsen", user.getName());
  }

  @Test
  @DisplayName("Create a user with an empty name")
  void createUserWithNullName() {
    try {
      new User(null);
      assertFalse(true);
    } catch (Exception e) {
      assertTrue(true);
    }
  }
}
