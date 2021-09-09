package com.excersise.entities.model.relations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Outfit {
  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne
  private Person person;
}
