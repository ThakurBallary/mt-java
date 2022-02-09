package com.mouritech.vegetablemanagementapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.vegetablemanagementapplication.exception.ResourceNotFoundException;
import com.mouritech.vegetablemanagementapplication.model.Vegetable;
import com.mouritech.vegetablemanagementapplication.repository.VegetableRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
@RequestMapping("/api/v1")
public class VegetableController {
	
	@Autowired
	private VegetableRepository VegetableRepository;
	
	@PostMapping("/vegetables")
	public Vegetable saveVegetable(@Valid @RequestBody Vegetable vegetable)
	{
		return VegetableRepository.save(vegetable);
	}
	
	@GetMapping("/vegetables")
	public List<Vegetable> getAllVegetables()
	{
		return VegetableRepository.findAll();
	}
	
	@PutMapping("/vegetables/{id}")
	public ResponseEntity<Vegetable> updateVegetable(@PathVariable(value = "id") String vegId,
	         @Valid @RequestBody Vegetable vegObj) throws ResourceNotFoundException {
	        Vegetable vegetable = VegetableRepository.findById(vegId)
	        .orElseThrow(() -> new ResourceNotFoundException("Vegetable not found for this id :: " + vegId));

	        vegetable.setAmount(vegObj.getAmount());
	        vegetable.setCustomerId(vegObj.getCustomerId());
	        vegetable.setStatus(vegObj.getStatus());
	        
	        final Vegetable updatedVegetable = VegetableRepository.save(vegetable);
	        return ResponseEntity.ok(updatedVegetable);
	    }	
	
	@DeleteMapping("/vegetables/{vegId}")
	public ResponseEntity<?> deleteVegetable( 
			@PathVariable(value = "vegId") String vegId)
	throws ResourceNotFoundException
	{
		return VegetableRepository.findById(vegId).map(vegetable -> {
			VegetableRepository.delete(vegetable);
		return ResponseEntity.ok().build();
		}).orElseThrow(()->new ResourceNotFoundException("vegetable not found"));
	}
	
	@GetMapping("/vegetables/{id}")
    public ResponseEntity<Vegetable> getVegetableById(@PathVariable(value = "id") String vegId)
        throws ResourceNotFoundException {
        Vegetable vegetable = VegetableRepository.findById(vegId)
          .orElseThrow(() -> new ResourceNotFoundException("Vegetable not found for this id :: " + vegId));
        return ResponseEntity.ok().body(vegetable);
    }

}
