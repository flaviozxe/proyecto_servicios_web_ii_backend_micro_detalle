package com.micro.detalle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.micro.detalle.entity.Usuario;
import com.micro.detalle.repository.UsuarioRepository;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.usuarioRepository.findByUsernameAndEnabled(username, true);
        if(usuario == null){
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return usuario;
    }

}
