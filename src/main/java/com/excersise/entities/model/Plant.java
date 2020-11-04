package com.excersise.entities.model;

import com.excersise.entities.view.View;
import com.fasterxml.jackson.annotation.JsonView;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.Nationalized;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Plant {

  @Id
  @GeneratedValue
  private Long id;

  @JsonView(View.class)
  @Nationalized // should use @Nationalized instead of @Type=nstring
  private String name;

  @Column(precision=12, scale=4)
  private BigDecimal price; // BigDecimal is the standard Java class for currency math

  //many plants can belong to one delivery
  @ManyToOne(fetch = FetchType.LAZY) //don't retrieve delivery if we don't need it
  @JoinColumn(name = "delivery_id")  //map the join column in the plant table
  private Delivery delivery;

  public Plant(String name, double price){
    this.name = name;
    this.price = BigDecimal.valueOf(price);
  }

  public Plant() {

  }
}
