package com.example.divisas.repositories;


import com.example.divisas.controllers.CocheOutput;
import com.example.divisas.entities.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CocheRepository extends JpaRepository<Coche, String> {

    boolean existsByFechaAndMatricula(Date fecha, String matricula);

    boolean existsByMatricula(String matricula);

    CocheOutput findByFechaAndMatricula(Date fecha, String matricula);

    Coche findByMatricula(String matricula);
}
