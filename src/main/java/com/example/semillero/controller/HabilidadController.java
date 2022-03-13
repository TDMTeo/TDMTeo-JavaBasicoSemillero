package com.example.semillero.controller;
import com.example.semillero.persistence.entity.HabilidadEntity;
import com.example.semillero.service.HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Habilidad")
public class HabilidadController {
    private HabilidadService habilidadService;
    @Autowired
    public HabilidadController(HabilidadService habilidadService){
        this.habilidadService = habilidadService;
    }

    @GetMapping("/")
    public List<HabilidadEntity> getAllHabilidad(){
        return habilidadService.getAllHabilidad();
    }

    @PostMapping("/")
    public ResponseEntity<HabilidadEntity> createHabilidad(@RequestBody HabilidadEntity habilidad){
        return new ResponseEntity<>(habilidadService.createHabilidad(habilidad), HttpStatus.CREATED);
    }


}
