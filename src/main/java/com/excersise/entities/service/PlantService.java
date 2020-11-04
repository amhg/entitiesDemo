package com.excersise.entities.service;

import com.excersise.entities.model.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
  public Plant getPlantByName(String name){
    return new Plant();
  }

}
