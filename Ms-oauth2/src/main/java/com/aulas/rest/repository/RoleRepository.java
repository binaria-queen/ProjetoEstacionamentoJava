package com.aulas.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulas.rest.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
