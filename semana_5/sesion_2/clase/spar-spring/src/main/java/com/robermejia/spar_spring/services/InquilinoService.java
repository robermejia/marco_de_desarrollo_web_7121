package com.robermejia.spar_spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.robermejia.spar_spring.entities.Inquilino;
import com.robermejia.spar_spring.repositories.InquilinoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InquilinoService {
    
    private final InquilinoRepository repository;

    /**
     * Devuelve todos los registros de la BD
     * @return una colección con los resultados
     */
    public List<Inquilino> getInquilinos(){
        return repository.findAll();
    }

    /**
     * Devuelve un registro basado en su id
     * @param id valor numérico
     * @return un objeto de tipo inquilino
     */
    public Inquilino getInquilinoById(Integer id){
        return repository.findById(id).orElse(new Inquilino());
    }

    public Inquilino insUpd(Inquilino inquilino){
        return repository.save(inquilino);
    }

    public Inquilino deleteInquilino(Integer id){
        if(repository.existsById(id)){
            Inquilino temp = getInquilinoById(id);
            repository.deleteById(id);
            return temp;
        }else{
            return new Inquilino();
        }
    }
}
