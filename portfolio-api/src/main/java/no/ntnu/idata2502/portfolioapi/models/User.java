package no.ntnu.idata2502.portfolioapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Represents a user in the database
 */
@Data
@Entity
@Table(name = User.tableName)
public class User {

  public final static String tableName = "users";
  public final static String primaryKey = "id";

  @Id
  @GeneratedValue
  @Column(name = User.primaryKey)
  private Long id;

  @Column(name = "name")
  private String name;

  public User() {
  }

  public User(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Name cannot be null");
    }
    this.name = name;
  }

}
