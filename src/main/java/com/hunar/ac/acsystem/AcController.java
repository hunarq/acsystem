package com.hunar.ac.acsystem;

import java.beans.ConstructorProperties;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hunar.ac.acsystem.model.Aircraft;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/aircraft")
public class AcController {
	
	@NonNull
	private final AcService acService;
	
	@ConstructorProperties({"persons"})
	AcController(@NonNull AcService acService) {
	    if (acService == null) {
	      throw new NullPointerException("acService");
	    } else {
	      this.acService = acService;
	    }
	}
	
	@GetMapping()
    public List<Aircraft> allAircraft() {
    	return  acService.listAircraft();
	}
 
	@PostMapping()
    public void addAircraft(@RequestBody Aircraft ac) {
		acService.addAircraft(ac);
	}

	@DeleteMapping()
    public void deleteAircraft() {
		acService.deleteAircraft();
	}

}

