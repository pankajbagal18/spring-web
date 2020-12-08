package com.example.springwebjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileReposity profileRepository;
	
	@Override
	public Profile save(Profile profile) {
		// TODO Auto-generated method stub
		return profileRepository.save(profile);
	}

	@Override
	public List<Profile> getAllProfile() {
		// TODO Auto-generated method stub
		return (List<Profile>) profileRepository.findAll();
	}
	
}
