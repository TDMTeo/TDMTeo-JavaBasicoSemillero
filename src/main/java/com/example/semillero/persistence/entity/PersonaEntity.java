package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="persona")
public class PersonaEntity {
    public PersonaEntity(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Per_Cod_Persona")

    private Long perCodPersona;
    public PersonaEntity(Long perCodPersona){
        this.perCodPersona = perCodPersona;
    }
    public Long getPerCodPersona(){
        return perCodPersona;
    }
    public void setPerCodPersona(Long perCodPersona){
        this.perCodPersona = perCodPersona;
    }


    @Column(name = "Per_Pri_Nombre")
    private String perPriNombre;
    public String getPerPriNombre(){
        return perPriNombre;
    }
    public void setPerPriNombre(String perPriNombre){
        this.perPriNombre = perPriNombre;
    }

    @Column(name = "Per_Seg_Nombre")
    private String perSegNombre;
    public String getPerSegNombre(){
        return perSegNombre;
    }
    public void setPerSegNombre(String perSegNombre){
        this.perSegNombre = perSegNombre;
    }

    @Column(name = "Per_Pri_Apellido")
    private String perPriApellido;
    public String getPerPriApellido(){
        return perPriApellido;
    }
    public void setPerPriApellido(String perPriApellido){
        this.perPriApellido = perPriApellido;
    }

    @Column(name = "Per_Seg_Apellido")
    private String perSegApellido;
    public String getPerSegApellido(){
        return perSegApellido;
    }
    public void setPerSegApellido(String perSegApellido){
        this.perSegApellido = perSegApellido;
    }

    @Column(name = "Per_Correo")
    private String perCorreo;
    public String getPerCorreo(){
        return perCorreo;
    }
    public void setPerCorreo(String perCorreo){
        this.perCorreo = perCorreo;
    }

    @Column(name = "Per_Contra")
    private  String perContra;
    public String getPerContra(){
        return perContra;
    }
    public void setPerContra(String perContra){
        this.perContra = perContra;
    }

    @ManyToOne
    @JsonBackReference(value = "rol")
    @JoinColumn(name = "Per_Rol")
    private RolEntity rol;
    public RolEntity getRol(){
        return rol;
    }
    public void setRol(RolEntity rol){
        this.rol = rol;
    }

}

