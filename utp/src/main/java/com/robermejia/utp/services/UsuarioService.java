package com.robermejia.utp.services;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.robermejia.utp.entities.Usuario;
import com.robermejia.utp.repositories.UsuarioRepository;
import com.robermejia.utp.utils.CustomUser;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UserDetailsService{
    
    private final UsuarioRepository repository;
    /*
    @Autowired
    private UsuarioRepository usuarioRepository;
     * 
     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.findByCorreo(username);
        if(usuario == null){
            throw new UsernameNotFoundException("Correo no encontrado");
        }
        return new CustomUser(usuario);
    }
    /* 
    @Transactional
    public void addUsers() {
        Usuario alumno = new Usuario();
        alumno.setNombre("alumno");
        alumno.setCorreo("alumno@mail.com");
        alumno.setClave("$2a$10$vvLEs7AJudJHxnL07iKyreFC1kcuxc6a605.FKp7phn8mNC4kxHGC");
        alumno.setTipo("admin");
        usuarioRepository.save(alumno);

        Usuario profesor = new Usuario();
        profesor.setNombre("profesor");
        profesor.setCorreo("profesor@mail.com");
        profesor.setClave("$2a$10$vvLEs7AJudJHxnL07iKyreFC1kcuxc6a605.FKp7phn8mNC4kxHGC");
        profesor.setTipo("admin");
        usuarioRepository.save(profesor);
    }*/
}
