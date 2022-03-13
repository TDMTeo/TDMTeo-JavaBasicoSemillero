package com.example.semillero.persistence.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "servicio")
public class ServicioEntity {
    public ServicioEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ser_Cod_Servicio")
    private Long serCodServicio;
    public ServicioEntity(Long serCodServicio){
        this.serCodServicio = serCodServicio;
    }
    public Long getSerCodServicio(){
        return serCodServicio;
    }
    public void setSerCodServicio(Long serCodServicio){
        this.serCodServicio = serCodServicio;
    }

    @Column(name = "Ser_Vr_Base")
    private Long serVrBase;
    public Long getSerVrBase(){
        return serVrBase;
    }
    public void setSerVrBase(Long serVrBase){
        this.serVrBase = serVrBase;
    }


    @Column(name = "Ser_Distancia")
    private String serDistancia;
    public String getSerDistancia(){
        return serDistancia;
    }
    public void setSerDistancia(String serDistancia){
        this.serDistancia = serDistancia;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    //@JsonBackReference("oferente")
    @JoinColumn(name = "Ser_Oferente")
    private PersonaEntity oferente;
    public PersonaEntity getOferente(){
        return oferente;
    }
    public void setOferente(PersonaEntity oferente){
        this.oferente = oferente;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    //@JsonBackReference("hacedor")
    @JoinColumn(name = "Ser_Hacedor")
    private PersonaEntity hacedor;
    public PersonaEntity getHacedor(){
        return hacedor;
    }
    public void setHacedor(PersonaEntity hacedor){
        this.hacedor = hacedor;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    //@JsonBackReference(value = "estado")
    @JoinColumn(name = "Ser_Estado")
    private EstadoEntity estado;
    public void setEstado(EstadoEntity estado){
        this.estado = estado;
    }

    public EstadoEntity getEstado() {
        return estado;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    //@JsonBackReference(value = "tarea")
    @JoinColumn(name = "Ser_Tarea")
    private TareaEntity tarea;
    public TareaEntity getTarea(){
        return tarea;
    }
    public void setTarea(TareaEntity tarea){
        this.tarea = tarea;
    }

}
