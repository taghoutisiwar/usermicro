package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(String role);
	
}