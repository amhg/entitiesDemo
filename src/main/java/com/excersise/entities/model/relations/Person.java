package com.excersise.entities.model.relations;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {
  @Id
  @GeneratedValue
  private Long id;

}
