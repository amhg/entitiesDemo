package com.excersise.entities.controller;

import com.excersise.entities.model.Plant;
import com.excersise.entities.model.PlantDTO;
import com.excersise.entities.service.PlantService;
import com.excersise.entities.view.View;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plant")
public class PlantController {

  @Autowired
  private PlantService plantService;

  @GetMapping("/plantDTO/{name}")
  public PlantDTO getPlantDTO(@PathVariable("name") String name){
    PlantDTO plantDTO = convertPlantToPlantDTO(name);
    return plantDTO;
  }


  @JsonView(View.class)
  @GetMapping("/plantView/{name}")
  public Plant getFilteredPlant(@PathVariable("name") String name){
    return plantService.getPlantByName(name);
  }

  private PlantDTO convertPlantToPlantDTO(String name) {
    PlantDTO plantDTO = new PlantDTO();
    Plant plant = plantService.getPlantByName(name);
    BeanUtils.copyProperties(plant, plantDTO);
    return plantDTO;
  }


}

/*
private static conertOutfitDTOToEntity(OutfitDTO outfitDTO){
  Outfit outfit = new OutFit();
  BeanUtils.copyProperties(outfitDTO, outfit);
  return outfit;
}*/

