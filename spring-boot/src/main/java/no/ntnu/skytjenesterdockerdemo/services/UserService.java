package no.ntnu.skytjenesterdockerdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import no.ntnu.skytjenesterdockerdemo.models.User;
import no.ntnu.skytjenesterdockerdemo.repositories.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;

  /**
   * Returns all users stored in the database
   * 
   * @return list of all users
   */
  public List<User> findAll() {
    return this.userRepository.findAll();
  }

  /**
   * Returns a user with the specified id
   * 
   * @param id the id of the user to find
   * @return an optional with a user if found, otherwise an empty optional
   */
  public Optional<User> findById(Long id) {
    return this.userRepository.findById(id);
  }
}
