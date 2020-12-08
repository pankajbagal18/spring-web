package com.example.springwebjpa;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface ProfileReposity extends CrudRepository<Profile, Integer>{
	
}