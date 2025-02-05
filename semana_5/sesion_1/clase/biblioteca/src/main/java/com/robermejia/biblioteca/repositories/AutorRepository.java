package com.robermejia.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.robermejia.biblioteca.entities.Autor;
public interface AutorRepository 
    extends JpaRepository<Autor,Integer>{
}