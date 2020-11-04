package com.excersise.entities.repository;

import com.excersise.entities.model.Delivery;
import com.excersise.entities.model.Plant;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {

  List<Plant> findByPriceLessThan(BigDecimal price);

  boolean deliveryCompleted(Long id);

}
