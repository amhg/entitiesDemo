package com.excersise.entities.model;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Flower extends Plant {
  private String color;
  
  private String name;
  private String origin;
  private int qty;
  private int qty2;
}
