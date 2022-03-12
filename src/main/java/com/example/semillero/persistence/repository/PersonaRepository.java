package com.example.semillero.persistence.repository;

import com.example.semillero.persistence.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends  JpaRepository<PersonaEntity,Long> {

}
