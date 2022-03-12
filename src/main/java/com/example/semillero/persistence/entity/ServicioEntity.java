package com.example.semillero.persistence.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "servicio")
public class ServicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ser_Cod_Servicio")
    private Long serCodServicio;

    public ServicioEntity(Long serCodServicio){
        this.serCodServicio = serCodServicio;
    }

    private Long getSerCodServicio(){
        return serCodServicio;
    }

    private void setSerCodServicio(Long serCodServicio){
        this.serCodServicio = serCodServicio;
    }

    @Column(name = "Ser_Vr_Base")
    private Long serVrBase;

    private Long getSerVrBase(){
        return serVrBase;
    }

    private void setSerVrBase(Long serVrBase){
        this.serVrBase = serVrBase;
    }


    @Column(name = "Ser_Distancia")
    private String serDistancia;

    private String getSerDistancia(){
        return serDistancia;
    }

    private void setSerDistancia(String serDistancia){
        this.serDistancia = serDistancia;
    }

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "Ser_Oferente")
    private PersonaEntity oferente;

    public PersonaEntity getOferente(){
        return oferente;
    }

    public void setOferente(PersonaEntity oferente){
        this.oferente = oferente;
    }

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "Ser_Hacedor")
    private PersonaEntity hacedor;

    public PersonaEntity getHacedor(){
        return hacedor;
    }

    public void setHacedor(PersonaEntity hacedor){
        this.hacedor = hacedor;
    }

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "Ser_Estado")
    private EstadoEntity estado;
    public EstadoEntity getEstado(){
        return estado;
    }

    public void setEstado(EstadoEntity estado){
        this.estado = estado;
    }


    @Override
    public String toString(){
        return "ServicioEntity{"+
                ", serCodServicio=" + serCodServicio +
                ", serVrBase=" + serVrBase +
                ", serDistancia='" + serDistancia + '\'' +
                ", oferente=" + oferente +
                ", hacedor=" + hacedor +
                ", estado=" +estado +
                '}';
    }





}
