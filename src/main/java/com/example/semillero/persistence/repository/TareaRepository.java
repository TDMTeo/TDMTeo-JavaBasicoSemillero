package com.example.semillero.persistence.repository;
import com.example.semillero.persistence.entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<TareaEntity,Long> {

}
