package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tarea")
public class TareaEntity {
    /* Campos de la base de datos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Tar_Cod_Tarea")
    private Long tarCodTarea;

    @Column(name = "Tar_Descripcion")
    private String tarDescripcion;
    /* Campos de la base de datos */

        /* Relacion de Tarea a Habilidad */
        @OneToMany(mappedBy = "tarea")
        @JsonManagedReference
        private List<HabilidadEntity> habilidad;
        public TareaEntity(){}
        /* Relacion de Persona a Rol */

    /* Getters y Setters de los campos de la base de datos */
    public  TareaEntity(Long tarCodTarea){
        this.tarCodTarea = tarCodTarea;
    }

    public Long getTarCodTarea(){
        return tarCodTarea;
    }

    public void setTarCodTarea(Long tarCodTarea){
        this.tarCodTarea = tarCodTarea;
    }

    public String getTarDescripcion(){
        return tarDescripcion;
    }

    public void setTarDescripcion(String tarDescripcion){
        this.tarDescripcion = tarDescripcion;
    }

    public List<HabilidadEntity> getHabilidad(){
        return habilidad;
    }

    public void setHabilidad(List<HabilidadEntity> habilidad){
        this.habilidad = habilidad;
    }
    /* Getters y Setters de los campos de la base de datos */

    /* Override para devolver los datos*/
    @Override
    public String toString(){
        return "TareaEntity{" +
                "tarCodTarea=" + tarCodTarea +
                ", tarDescripcion='" + tarDescripcion + '\'' +
                ", habilidad=" +habilidad +
                '}';
    }
    /* Override para devolver los datos*/


}
