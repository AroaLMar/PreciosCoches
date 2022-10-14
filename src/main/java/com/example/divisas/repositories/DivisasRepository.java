package com.example.divisas.repositories;


import com.example.divisas.entities.Divisas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface DivisasRepository extends JpaRepository<Divisas, Date> {


   Divisas findByFecha(Date fecha);
}
