package com.example.semillero.controller;
import com.example.semillero.persistence.entity.PersonaEntity;
import com.example.semillero.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Persona")
public class PersonaController {
    private PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    @PutMapping("/{perCodPersona}")
    public ResponseEntity<PersonaEntity> consultarPerfil(@PathVariable Long perCodPersona){
        return new ResponseEntity<>(personaService.consultarPerfil(perCodPersona), HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<PersonaEntity> createPersona(@RequestBody PersonaEntity persona){
        return new ResponseEntity<>(personaService.createPersona(persona),HttpStatus.CREATED);
    }


}
