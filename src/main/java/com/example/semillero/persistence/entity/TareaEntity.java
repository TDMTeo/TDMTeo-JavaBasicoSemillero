package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tarea")
public class TareaEntity {
    public TareaEntity(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Tar_Cod_Tarea")
    private Long tarCodTarea;
    public TareaEntity(Long tarCodTarea) {
        this.tarCodTarea = tarCodTarea;
    }
    public Long getTarCodTarea() {
        return tarCodTarea;
    }

    public void setTarCodTarea(Long tarCodTarea) {
        this.tarCodTarea = tarCodTarea;
    }

    @Column(name = "Tar_Descripcion")
    private String tarDescripcion;
    public String getTarDescripcion(){
        return tarDescripcion;
    }
    public void setTarDescripcion(String tarDescripcion){
        this.tarDescripcion = tarDescripcion;
    }

}
