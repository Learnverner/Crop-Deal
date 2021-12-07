package com.tell.service;

import java.util.List;
import java.util.Optional;

import com.tell.model.CropDetails;
public interface CropService {
	
	public CropDetails save( CropDetails cropdetails);
	public List<CropDetails> getAll();
	public Optional<CropDetails> getCropDetailsById(int id);
	public String deleteCropDetails( int id);
	public String updateCropDetails( CropDetails cropdetails, int id);
	public Optional<CropDetails>getCropDetailsByName(String cropName);
	Optional<CropDetails> getCropDetailsByType(String cropType);
	

}