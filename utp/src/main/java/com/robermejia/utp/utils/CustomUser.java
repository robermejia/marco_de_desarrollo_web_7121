package com.robermejia.utp.utils;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.robermejia.utp.entities.Usuario;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomUser implements UserDetails {

    private final Usuario usuario;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(usuario.getTipo());
        return Arrays.asList(authority);
    }

    @Override
    public String getPassword() {
        return usuario.getClave();
    }

    @Override
    public String getUsername() {
        return usuario.getCorreo();
    }

}
