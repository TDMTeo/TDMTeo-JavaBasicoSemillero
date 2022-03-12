package com.example.semillero.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "habilidad")
public class HabilidadEntity {
    /* Campos de la base de datos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Hab_Cod_Habilidad")
    private  Long habCodHabilidad;

    @Column(name = "Hab_Vr_Esperado")
    private Long habVrEsperado;

    @Column(name = "Hab_Rango_Viaje")
    private String habRangoViaje;

        /* Relacion de Habilidad a Tarea */
        @ManyToOne
        @JsonBackReference
        @JoinColumn(name = "Hab_Tarea")
        private TareaEntity tarea;
        /* Relacion de Habilidad a Tarea */


    /* Campos de la base de datos */

    /* Getters y Setters de los campos de la base de datos */
    public Long getHabCodHabilidad(){
        return habCodHabilidad;
    }

    public void setHabCodHabilidad(Long habCodHabilidad){
        this.habCodHabilidad = habCodHabilidad;
    }

    public Long getHabVrEsperado(){
        return habVrEsperado;
    }

    public void setHabVrEsperado(Long habVrEsperado){
        this.habVrEsperado = habVrEsperado;
    }

    public String getHabRangoViaje(){
        return habRangoViaje;
    }

    public void setHabRangoViaje(String habRangoViaje){
        this.habRangoViaje = habRangoViaje;
    }

        /* Relacion de Habilidad a Tarea */
        public TareaEntity getTarea(){
            return tarea;
        }

        public void setTarea(TareaEntity tarea){
            this.tarea = tarea;
        }
        /* Relacion de Habilidad a Tarea */


    /* Getters y Setters de los campos de la base de datos */

    /* Override para devolver los datos*/
    @Override
    public String toString(){
        return "HabilidadEntity{" +
                "habCodHabilidad=" + habCodHabilidad +
                ", habVrEsperado=" + habVrEsperado  +
                ", habRangoViaje='" + habRangoViaje + '\'' +
                ", tarea=" + tarea +
                '}';
    }

    /* Override para devolver los datos*/

}
