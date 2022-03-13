package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="rol")
public class RolEntity {
    public RolEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Rol_Cod_Rol")
    private Long rolCodRol;
    public RolEntity(Long rolCodRol){
        this.rolCodRol = rolCodRol;
    }
    public Long getRolCodRol(){
        return rolCodRol;
    }
    public void setRolCodRol(Long rolCodRol){
        this.rolCodRol = rolCodRol;
    }

    @Column(name = "Rol_Nombre")
    private String rolNombre;
    public String getRolNombre(){
        return rolNombre;
    }
    public void setRolNombre(String rolNombre){
        this.rolNombre = rolNombre;
    }

}
