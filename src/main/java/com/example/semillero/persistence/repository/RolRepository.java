package com.example.semillero.persistence.repository;

import com.example.semillero.persistence.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<RolEntity,Long>{

    Optional<RolEntity> findByRolNombre(String rolNombre);
}
