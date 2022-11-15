package no.ntnu.skytjenesterdockerdemo.controllerTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import no.ntnu.skytjenesterdockerdemo.controller.AppController;

@SpringBootTest
public class AppControllerTests {
  @Test
  void testVersionEndpoint() {
    AppController appController = new AppController();

    assertEquals("version 1.0", appController.version().getBody());
  }
}
