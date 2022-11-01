package no.ntnu.idata2502.portfolioapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.ntnu.idata2502.portfolioapi.models.User;

/**
 * Repository used for accesing users
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
