package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="rol")
public class RolEntity {
    /* Campos de la base de datos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Rol_Cod_Rol")
    private Long rolCodRol;

    @Column(name = "Rol_Nombre")
    private String rolNombre;
    /* Campos de la base de datos */


        /* Relacion de Persona a Rol */
        @OneToMany(mappedBy = "rol")
        @JsonManagedReference
        private List<PersonaEntity> persona;
        public RolEntity() {}
        /* Relacion de Persona a Rol */

    /* Getters y Setters de los campos de la base de datos */
    public RolEntity(Long rolCodRol){
        this.rolCodRol = rolCodRol;
    }

    public Long getRolCodRol(){
        return rolCodRol;
    }

    public void setRolCodRol(Long rolCodRol){
        this.rolCodRol = rolCodRol;
    }

    public String getRolNombre(){
        return rolNombre;
    }

    public void setRolNombre(String rolNombre){
        this.rolNombre = rolNombre;
    }

    public List<PersonaEntity> getPersona(){
        return persona;
    }

    public void setPersona(List<PersonaEntity> persona){
        this.persona = persona;
    }
    /* Getters y Setters de los campos de la base de datos */

    /* Override para devolver los datos*/
    @Override
    public String toString(){
        return "RolEntity{" +
                "rolCodRol=" + rolCodRol +
                ", rolNombre='" + rolNombre + '\'' +
                ", persona=" + persona +
                '}';
    }
    /* Override para devolver los datos*/

}
