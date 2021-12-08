package com.tell.service;

import java.util.List;
import java.util.Optional;

import com.tell.model.CropDetails;
public interface CropService {
	
	public CropDetails save( CropDetails cropdetails);
	public List<CropDetails> getAll();
	public Optional<CropDetails> getCropDetailsById(int cropId);
	public String deleteCropDetails( int cropId);
	public String updateCropDetails( CropDetails cropDetails, int cropId);
	public Optional<CropDetails>getCropDetailsByName(String cropName);
	Optional<CropDetails> getCropDetailsByType(String cropType);
	

}