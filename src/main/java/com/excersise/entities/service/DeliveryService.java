package com.excersise.entities.service;

import com.excersise.entities.model.Delivery;
import com.excersise.entities.repository.DeliveryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

  @Autowired
  DeliveryRepository deliveryRepository;

  public Long save(Delivery delivery) {
    delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
    deliveryRepository.persist(delivery);
    return delivery.getId();
  }

  public List<Delivery> findDeliveriesByName(String name){
    return deliveryRepository.findDeliveriesByName(name);
  }

}
