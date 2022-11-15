package no.ntnu.skytjenesterdockerdemo;

import java.util.Optional;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ntnu.skytjenesterdockerdemo.models.User;
import no.ntnu.skytjenesterdockerdemo.repositories.UserRepository;

@Component
@RequiredArgsConstructor
@Slf4j
public class DummyDataInitializer implements ApplicationListener<ApplicationReadyEvent> {

  private final UserRepository userRepository;

  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {
    Optional<User> existingUser = userRepository.findById(1L);
    
    if (!existingUser.isPresent()) {
      log.info("Importing dummy data...");

      User joakim = new User("Joakim Edvardsen");
      User ole = new User("Ole Olsen");
      User per = new User("Per Hansen");

      userRepository.save(joakim);
      userRepository.save(ole);
      userRepository.save(per);

      log.info("Finished initializing dummy data!");
    } else {
      log.info("Data already imported:)");
    }
  }
}
