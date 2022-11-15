package com.micro.detalle.service;

import java.util.List;

import com.micro.detalle.entity.Rol;


public interface RolService {
	
	public Rol buscarRolporId(Long id);
	
	public Rol buscarRolNombre(String rolNombre);
	
	public List<Rol> listarRol();

}
