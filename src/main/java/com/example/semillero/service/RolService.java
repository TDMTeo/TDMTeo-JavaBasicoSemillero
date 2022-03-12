package com.example.semillero.service;

import com.example.semillero.persistence.entity.RolEntity;
import com.example.semillero.persistence.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {
    private RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository){
        this.rolRepository = rolRepository;
    }

    public List<RolEntity> getAllRol(){
        return rolRepository.findAll();
    }

    public RolEntity createRol(RolEntity rol){
        return rolRepository.save(rol);
    }

    public RolEntity updateRol(RolEntity rol,Long rolCodRol){
        return rolRepository.findById(rolCodRol)
                .map(
                        updRol -> {
                            updRol.setRolNombre(rol.getRolNombre());
                            return rolRepository.save(updRol);
                        }
                ).get();
    }

    public void deleteRol(Long rolCodRol){
        rolRepository.delete(new RolEntity(rolCodRol));
    }

}
