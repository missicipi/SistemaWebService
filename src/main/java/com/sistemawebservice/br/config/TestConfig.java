package com.sistemawebservice.br.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sistemawebservice.br.entities.User;
import com.sistemawebservice.br.repositories.UserRpository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRpository userRpository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Thiessen Docinho","thiessenthi@gmail.com","123456");
		User u2 = new User(null, "Isabel bb","isabelpereiramessiasmachado@gmail.com","123456");
	
	userRpository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
