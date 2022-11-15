package com.micro.detalle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.detalle.entity.Rol;



@Repository
public interface RolRepository extends JpaRepository<Rol,Long> {
	
	public Rol findByRolId(Long rolId);
	
	public Rol findByRolNombre(String rolNombre);
}
