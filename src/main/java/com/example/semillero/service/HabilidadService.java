package com.example.semillero.service;
import com.example.semillero.persistence.entity.HabilidadEntity;
import com.example.semillero.persistence.repository.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadService {
    private HabilidadRepository habilidadRepository;

    @Autowired
    public HabilidadService(HabilidadRepository habilidadRepository){
        this.habilidadRepository = habilidadRepository;
    }

    public List<HabilidadEntity> getAllHabilidad(){
        return habilidadRepository.findAll();
    }

    public HabilidadEntity createHabilidad(HabilidadEntity habilidad){
        return habilidadRepository.save(habilidad);
    }
}
