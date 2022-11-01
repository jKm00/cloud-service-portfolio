package no.ntnu.idata2502.portfolioapi.controllerTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import no.ntnu.idata2502.portfolioapi.controllers.AppController;

@SpringBootTest
public class AppControllerTests {

  @Test
  void testVersionEndpoint() {
    AppController appController = new AppController();

    assertEquals("version 1.0", appController.version());
  }
}
