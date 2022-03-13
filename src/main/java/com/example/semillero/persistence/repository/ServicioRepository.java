package com.example.semillero.persistence.repository;
import com.example.semillero.persistence.entity.ServicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<ServicioEntity,Long> {
    @Query(nativeQuery = true, value = "select s.*\n" +
            "from servicio s \n" +
            "inner join habilidad h on s.ser_tarea = h.hab_tarea\n" +
            "inner join persona p on h.hab_persona = p.per_cod_persona\n" +
            "where s.ser_estado = 1 and s.ser_hacedor is null \n" +
            "and p.per_cod_persona = :persona")
    List<ServicioEntity> findByPersona(Long persona);

    @Query(nativeQuery = true, value = "select s.*\n" +
            "from servicio s\n" +
            "where s.Ser_Cod_Servicio =:serCodServicio and \n" +
            "s.Ser_Estado = 2 OR s.ser_hacedor is not null")
    List<ServicioEntity> findByAceptado(Long serCodServicio);

}
