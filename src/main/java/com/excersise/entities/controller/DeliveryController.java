package com.excersise.entities.controller;

import com.excersise.entities.model.Delivery;
import com.excersise.entities.service.DeliveryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

  @Autowired
  DeliveryService deliveryService;

  @PostMapping
  public Long scheduleDelivery(@RequestBody Delivery delivery) {
    return deliveryService.save(delivery);
  }

  @GetMapping
  public ResponseEntity<List<Delivery>> getDeliveriesByName(@RequestParam String name){
    List<Delivery> deliveries = deliveryService.findDeliveriesByName(name);
    return new ResponseEntity<List<Delivery>>(deliveries, HttpStatus.OK);
  }

  @GetMapping
  void getOranges(){
    String orange;
    String name;
    int counter;

  }



}
