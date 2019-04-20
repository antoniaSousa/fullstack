package com.example.algamoney.api.config;

import java.util.Collection;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.GrantedAuthority;

import com.example.algamoney.api.model.Usuario;

public class UsuarioSistema extends User {
	
	private static final long serialVersionUID = 1L;

	private Usuario usuario;

	public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
		//super(usuario.getEmail(), usuario.getSenha(), authorities);
		super();
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
