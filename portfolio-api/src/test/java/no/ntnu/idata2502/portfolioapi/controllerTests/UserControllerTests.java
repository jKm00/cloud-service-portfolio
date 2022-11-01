package no.ntnu.idata2502.portfolioapi.controllerTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import no.ntnu.idata2502.portfolioapi.controllers.UserController;
import no.ntnu.idata2502.portfolioapi.models.User;

@SpringBootTest
public class UserControllerTests {

  @Autowired
  private UserController userController;

  @Test
  @DisplayName("Make sure controller is not null")
  public void testControllerNotNull() {
    assertNotNull(userController);
  }

  @Test
  @DisplayName("Test correct number of users stored in database")
  public void getAllUsers() {
    List<User> users = this.userController.findAll().getBody();
    if (users == null) {
      assertFalse(true);
    } else {
      assertEquals(2, users.size());
    }
  }

  @Test
  @DisplayName("Test the specific user endpoint returns the correct user")
  public void getSpecificUser() {
    User user = this.userController.findById(1L).getBody();

    if (user == null) {
      assertFalse(true);
    } else {
      assertEquals(user.getName(), "Joakim Edvardsen");
    }
  }

  @Test
  @DisplayName("Test request for non-existing user returns bad request")
  public void getNonExistingUser() {
    User user = this.userController.findById(3L).getBody();

    assertNull(user);
  }
}