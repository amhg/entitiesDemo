package com.excersise.entities.model;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Flower extends Plant {
  private String color;
}
