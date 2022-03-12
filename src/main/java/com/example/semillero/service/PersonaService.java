package com.example.semillero.service;

import com.example.semillero.persistence.entity.PersonaEntity;
import com.example.semillero.persistence.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    public PersonaEntity createPersona(PersonaEntity persona){
        return personaRepository.save(persona);
    }

    public PersonaEntity consultarPerfil(Long perCodPersona){
        return personaRepository.findById(perCodPersona)
                .map(
                        prfPersona ->{
                            return personaRepository.save(prfPersona);
                        }
                ).get();
    }
}
