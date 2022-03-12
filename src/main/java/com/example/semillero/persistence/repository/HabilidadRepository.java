package com.example.semillero.persistence.repository;
import com.example.semillero.persistence.entity.HabilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<HabilidadEntity,Long> {
}
