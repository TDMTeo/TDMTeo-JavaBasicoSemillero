package com.example.semillero.service;

import com.example.semillero.persistence.entity.ServicioEntity;
import com.example.semillero.persistence.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioService {
    private ServicioRepository servicioRepository;

    @Autowired
    public ServicioService(ServicioRepository servicioRepository){
        this.servicioRepository = servicioRepository;
    }

    public ServicioEntity createServicio(ServicioEntity servicio){
        return servicioRepository.save(servicio);
    }

    public List<ServicioEntity> getServiciosByPersona(Long persona){
        return servicioRepository.findByPersona(persona);
    }

    public ServicioEntity AceptarServicio(ServicioEntity servicio,Long serCodServicio){
        return servicioRepository.findById(serCodServicio)
                .map(
                        updServicio -> {
                            updServicio.setHacedor(servicio.getHacedor());
                            return servicioRepository.save(updServicio);
                        }
                ).get();
    }

    public List<ServicioEntity> getServiciosAceptados(Long serCodServicio){
        return servicioRepository.findByAceptado(serCodServicio);
    }


}
