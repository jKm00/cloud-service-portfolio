package no.ntnu.idata2502.portfolioapi.modelTests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

import no.ntnu.idata2502.portfolioapi.models.User;

@SpringBootTest
public class UserTests {
  @Test
  @DisplayName("Create a valid user")
  public void createUser() {
    User user = new User("Joakim Edvardsen");

    assertEquals("Joakim Edvardsen", user.getName());
  }

  @Test
  @DisplayName("Create a user with an empty name")
  public void createUserWithNullName() {
    try {
      User user = new User(null);
      assertFalse(true);
    } catch (Exception e) {
      assertTrue(true);
    }
  }
}
