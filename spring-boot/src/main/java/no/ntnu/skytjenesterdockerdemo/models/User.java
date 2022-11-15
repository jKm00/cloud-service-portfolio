package no.ntnu.skytjenesterdockerdemo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = User.tableName)
public class User {

	public final static String tableName = "users";
  public final static String primaryKey = "user_id";
  
  @Id
  @GeneratedValue(strategy =  GenerationType.AUTO)
  @Column(name = User.primaryKey)
  private Long id;

  @Column(name = "username")
  private String name;

  public User() {}

  public User(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Name cannot be null");
    }
    this.name = name;
	}
}
