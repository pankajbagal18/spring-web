package com.example.springwebjpa;

import java.util.List;

import org.springframework.stereotype.Service;

public interface ProfileService {
	public Profile save(Profile profile);
	public List<Profile> getAllProfile();
}
