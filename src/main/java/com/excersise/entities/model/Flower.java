package com.excersise.entities.model;


public class Flower extends Plant {
  private String color;

  private String name;
  private String origin;
  private int qty;
  private int qty2;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
