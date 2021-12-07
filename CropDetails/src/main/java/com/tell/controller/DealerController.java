package com.tell.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tell.model.CropDetails;
import com.tell.service.CropService;

@RestController
@RequestMapping("/api/dealer")
public class DealerController {

	
	@Autowired
	CropService cropService ;
	
	
	//find all cropdetails
		@GetMapping("/findAllcropdetails")
		public List<CropDetails> getAll(){
			return cropService.getAll();
		}
		
		
		
		//find the cropdetails by id
		@GetMapping("/findAllCropDetails/{id}")
		public Optional<CropDetails> getCropDetails(@PathVariable int id){
			return cropService.getCropDetailsById(id);
		}
		
		
		//find the cropdetails by name
		@GetMapping("/findAllCrops/{cropName}")
		public Optional<CropDetails> getCropDetailsByName(@PathVariable String cropName){
			return cropService.getCropDetailsByName(cropName);
		}
		
		
		@GetMapping("/findAllCropsByType/{cropType}")
		public Optional<CropDetails>getCropDetailsByType(@PathVariable String cropType){
			return cropService.getCropDetailsByType(cropType);
		}
}
