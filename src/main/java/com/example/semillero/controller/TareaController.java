package com.example.semillero.controller;
import com.example.semillero.persistence.entity.TareaEntity;
import com.example.semillero.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/tarea")

public class TareaController {

    private TareaService tareaService;
    @Autowired
    public TareaController(TareaService tareaService){
        this.tareaService = tareaService;
    }

    @GetMapping("/")
    public List<TareaEntity> getAllTarea(){
        return tareaService.getAllTarea();
    }
}
