package com.example.semillero.controller;
import com.example.semillero.persistence.entity.RolEntity;
import com.example.semillero.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {

    private RolService rolService;
    @Autowired
    public RolController(RolService rolService){
        this.rolService = rolService;
    }



    /* EJEMPLOS */
    @GetMapping("/")
    public List<RolEntity> getAllRol(){
        return rolService.getAllRol();
    }

    @PostMapping(value = "/",consumes = {"application/xml","application/json"})
    public ResponseEntity<RolEntity> createRol(@RequestBody RolEntity rol){
        return new ResponseEntity<>(rolService.createRol(rol), HttpStatus.CREATED);
    }

    @PutMapping("/{rolCodRol}")
    public ResponseEntity<RolEntity> updateRol(@RequestBody RolEntity rol, @PathVariable Long rolCodRol){
        return new ResponseEntity<>(rolService.updateRol(rol,rolCodRol), HttpStatus.OK);
    }

    @DeleteMapping("/{rolCodRol}")
    public ResponseEntity<Void> deleteRol(@PathVariable Long rolCodRol){
        rolService.deleteRol(rolCodRol);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /* EJEMPLOS */

}
