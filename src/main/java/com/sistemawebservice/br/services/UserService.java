package com.sistemawebservice.br.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemawebservice.br.entities.User;
import com.sistemawebservice.br.repositories.UserRpository;


@Service
public class UserService {
	
	@Autowired
	private UserRpository repository;

	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
