package com.example.semillero.controller;
import com.example.semillero.persistence.entity.PersonaEntity;
import com.example.semillero.persistence.entity.ServicioEntity;
import com.example.semillero.persistence.entity.TareaEntity;
import com.example.semillero.service.ServicioService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
    private ServicioService servicioService;

    @Autowired
    public ServicioController(ServicioService servicioService){
        this.servicioService = servicioService;
    }

    @PostMapping("/")
    public ResponseEntity<ServicioEntity> createServicio(@RequestBody ServicioEntity servicio){
        return new ResponseEntity<>(servicioService.createServicio(servicio), HttpStatus.CREATED);
    }

    @GetMapping("/solicitudes")
    public List<ServicioEntity> getServiciosByTarea(@RequestParam Long persona){
        return servicioService.getServiciosByPersona(persona);
    }

    @PutMapping("/aceptar/{serCodServicio}")
    public ResponseEntity<ServicioEntity> AceptarServicio(@RequestBody ServicioEntity servicio, @PathVariable Long serCodServicio){
        return new ResponseEntity<>(servicioService.AceptarServicio(servicio,serCodServicio),HttpStatus.OK);
    }

    @GetMapping("/servicios/aceptados")
    public List<ServicioEntity> getServiciosAceptados(@RequestParam Long serCodServicio){
        return servicioService.getServiciosAceptados(serCodServicio);
    }
}
