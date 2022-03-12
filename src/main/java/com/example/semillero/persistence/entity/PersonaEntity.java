package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="persona")
public class PersonaEntity {
    /* Campos de la base de datos */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Per_Cod_Persona")
    private Long perCodPersona;

    @Column(name = "Per_Pri_Nombre")
    private String perPriNombre;

    @Column(name = "Per_Seg_Nombre")
    private String perSegNombre;

    @Column(name = "Per_Pri_Apellido")
    private String perPriApellido;

    @Column(name = "Per_Seg_Apellido")
    private String perSegApellido;

    @Column(name = "Per_Correo")
    private String perCorreo;

    @Column(name = "Per_Contra")
    private  String perContra;

        /* Relacion de Persona a Rol */
        @ManyToOne
        @JsonBackReference
        @JoinColumn(name = "Per_Rol")
        private RolEntity rol;
        /* Relacion de Persona a Rol */
    /* Campos de la base de datos */

    /* Getters y Setters de los campos de la base de datos */
    public PersonaEntity(Long perCodPersona){
        this.perCodPersona = perCodPersona;
    }
    public Long getPerCodPersona(){
        return perCodPersona;
    }

    public void setPerCodPersona(Long perCodPersona){
        this.perCodPersona = perCodPersona;
    }

    public String getPerPriNombre(){
        return perPriNombre;
    }

    public void setPerPriNombre(String perPriNombre){
        this.perPriNombre = perPriNombre;
    }

    public String getPerSegNombre(){
        return perSegNombre;
    }

    public void setPerSegNombre(String perSegNombre){
        this.perSegNombre = perSegNombre;
    }

    public String getPerPriApellido(){
        return perPriApellido;
    }

    public void setPerPriApellido(String perPriApellido){
        this.perPriApellido = perPriApellido;
    }

    public String getPerSegApellido(){
        return perSegApellido;
    }

    public void setPerSegApellido(String perSegApellido){
        this.perSegApellido = perSegApellido;
    }

    public String getPerCorreo(){
        return perCorreo;
    }

    public void setPerCorreo(String perCorreo){
        this.perCorreo = perCorreo;
    }

    public String getPerContra(){
        return perContra;
    }

    public void setPerContra(String perContra){
        this.perContra = perContra;
    }


        /* Relacion de Persona a Rol */
        public RolEntity getRol(){
            return rol;
        }

        public void setRol(RolEntity rol){
            this.rol = rol;
        }
        /* Relacion de Persona a Rol */

    /* Getters y Setters de los campos de la base de datos */


    /* Override para devolver los datos*/
    @Override
    public String toString(){
        return "PersonaEntity{" +
                "perCodPersona="+ perCodPersona +
                ", perPriNombre='" + perPriNombre + '\'' +
                ", perSegNombre='" + perSegNombre + '\'' +
                ", perPriApellido='" + perPriApellido + '\'' +
                ", perSegApellido='" + perSegApellido + '\'' +
                ", perCorreo ='" + perCorreo + '\'' +
                ", perContra ='" + perContra + '\'' +
                ", rol="+ rol +
                '}';
    }
    /* Override para devolver los datos*/

}

