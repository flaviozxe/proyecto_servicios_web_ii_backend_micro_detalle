package com.micro.detalle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.detalle.entity.Rol;
import com.micro.detalle.repository.RolRepository;



@Service
public class RolServiceImpl implements RolService{
	
	@Autowired
	RolRepository rolRepository;
	
	@Override
	public Rol buscarRolporId(Long id) {
		return rolRepository.findByRolId(id);
	}

	@Override
	public Rol buscarRolNombre(String rolNombre) {
		return rolRepository.findByRolNombre(rolNombre);
	}

	@Override
	public List<Rol> listarRol() {
		return rolRepository.findAll();

	}

}
