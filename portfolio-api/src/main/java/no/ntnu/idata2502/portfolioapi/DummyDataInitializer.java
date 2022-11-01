package no.ntnu.idata2502.portfolioapi;

import java.util.Optional;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ntnu.idata2502.portfolioapi.models.User;
import no.ntnu.idata2502.portfolioapi.repositories.UserRepository;

@Component
@RequiredArgsConstructor
@Slf4j
public class DummyDataInitializer implements ApplicationListener<ApplicationReadyEvent> {

  private final UserRepository userRepository;

  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {
    Optional<User> existingUser = this.userRepository.findById(1L);

    if (existingUser.isEmpty()) {
      log.info("Importing test data...");

      User joakim = new User("Joakim Edvardsen");
      User jonas = new User("Jonas Karlsen");

      userRepository.save(joakim);
      userRepository.save(jonas);

      log.info("Finished importing test data!`");
    } else {
      log.info("Test data already exists!");
    }
  }

}
