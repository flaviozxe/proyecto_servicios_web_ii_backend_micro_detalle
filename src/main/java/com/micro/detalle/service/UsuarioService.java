package com.micro.detalle.service;

import java.util.Set;

import com.micro.detalle.entity.Usuario;
import com.micro.detalle.entity.UsuarioRol;



public interface UsuarioService {
	 public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
	 
	 public Usuario actualizarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

	 
	    public Usuario obtenerUsuario(String username);

	    public void eliminarUsuario(Long usuarioId);
}
