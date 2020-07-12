package com.sistemawebservice.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemawebservice.br.entities.User;

public interface UserRpository extends JpaRepository<User, Long> {

}
