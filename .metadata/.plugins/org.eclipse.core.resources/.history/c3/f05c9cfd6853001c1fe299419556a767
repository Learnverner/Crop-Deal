package com.tell.service;

import java.util.List;
import java.util.Optional;

import com.tell.model.CropDetails;
public interface CropService {
	
	public CropDetails save( CropDetails cropdetails);
	public List<CropDetails> getAll();
	public Optional<CropDetails> getCropDetailsById(String id);
	public String deleteCropDetails( String id);
	public String updateCropDetails( CropDetails cropdetails, String id);
	public Optional<CropDetails>getCropDetailsByName(String cropName);
	public boolean isCropDetailsExist(String id);

}