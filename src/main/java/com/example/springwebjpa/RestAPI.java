package com.example.springwebjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("profile")
public class RestAPI {

	@Autowired
	private ProfileService profileService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,path= {"/save"})
	public Profile saveProfie(@RequestBody Profile profile) {
		return profileService.save(profile);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE,path= {"/all"})
	public List<Profile> getAllProfiles(){
		return profileService.getAllProfile();
	}
}
