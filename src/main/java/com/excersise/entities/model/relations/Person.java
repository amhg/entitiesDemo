package com.excersise.entities.model.relations;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.Data;

/*@Data
@Entity
public class Person {
  @Id
  @GeneratedValue
  private Long id;

  @ManyToMany
  @JoinTable(
      name = "person_outfit",
      joinColumns = { @JoinColumn(name = "person_id")},
      inverseJoinColumns = { @JoinColumn(name = "outfit_id")}
  )
  private List<Outfit> outfits;

}*/
