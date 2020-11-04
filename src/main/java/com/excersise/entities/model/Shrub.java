package com.excersise.entities.model;

import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Shrub extends Plant{
  private int heightCm; //any reasonable unit of measurement is fine
  private int widthCm;

}
