package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "habilidad")
public class HabilidadEntity {
    public HabilidadEntity(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Hab_Cod_Habilidad")

    private  Long habCodHabilidad;
    public HabilidadEntity(Long habCodHabilidad){
        this.habCodHabilidad = habCodHabilidad;
    }
    public Long getHabCodHabilidad(){
        return habCodHabilidad;
    }
    public void setHabCodHabilidad(Long habCodHabilidad){
        this.habCodHabilidad = habCodHabilidad;
    }

    @Column(name = "Hab_Vr_Esperado")
    private Long habVrEsperado;
    public Long getHabVrEsperado(){
        return habVrEsperado;
    }
    public void setHabVrEsperado(Long habVrEsperado){
        this.habVrEsperado = habVrEsperado;
    }

    @Column(name = "Hab_Rango_Viaje")
    private String habRangoViaje;
    public String getHabRangoViaje(){
        return habRangoViaje;
    }
    public void setHabRangoViaje(String habRangoViaje){
        this.habRangoViaje = habRangoViaje;
    }


    @ManyToOne
    @JsonBackReference(value = "tarea")
    @JoinColumn(name = "Hab_Tarea")
    private TareaEntity tarea;
    public TareaEntity getTarea(){
        return tarea;
    }
    public void setTarea(TareaEntity tarea){
        this.tarea = tarea;
    }

    @ManyToOne
    @JsonBackReference(value = "persona")
    @JoinColumn(name = "Hab_Persona")
    private PersonaEntity persona;
    public PersonaEntity getPersona(){
        return persona;
    }
    public void setPersona(PersonaEntity persona){
        this.persona = persona;
    }

}
