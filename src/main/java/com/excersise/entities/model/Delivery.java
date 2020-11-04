package com.excersise.entities.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

@NamedQuery(
    name = "Delivery.findDeliveryByName",
    query = "select d from Delivery d where d.name = :name"
)
@Data
@Entity
public class Delivery {
  @Id
  @GeneratedValue
  private Long id;

  @Nationalized
  private String name;
  @Column(name = "address_full", length = 500)
  private String address;
  private LocalDateTime deliveryTime;
  @Type(type = "yes_no")
  private Boolean completed = false;

  //make sure to specify mappedBy. Lazy fetch optional,
  //  but often a good idea for collection attributes
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.ALL)
  private List<Plant> plants;


  public Delivery(String name, String address, LocalDateTime deliveryTime) {
    this.name = name;
    this.address = address;
    this.deliveryTime = deliveryTime;
  }

  public Delivery() {

  }
}


// added CascadeType.REMOVE to automatically clear any associated plants when removed
//cascade = CascadeType.REMOVE

