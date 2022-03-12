package com.example.semillero.service;
import com.example.semillero.persistence.entity.TareaEntity;
import com.example.semillero.persistence.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    private TareaRepository tareaRepository;

    @Autowired
    public TareaService(TareaRepository tareaRepository){
        this.tareaRepository = tareaRepository;
    }

    public List<TareaEntity> getAllTarea(){
        return tareaRepository.findAll();
    }

}
