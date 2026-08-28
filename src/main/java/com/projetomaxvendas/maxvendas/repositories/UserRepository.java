package com.projetomaxvendas.maxvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetomaxvendas.maxvendas.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
