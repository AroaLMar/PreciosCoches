package com.example.divisas.controllers;


import com.example.divisas.entities.Coche;
import com.example.divisas.entities.Divisas;
import com.example.divisas.exceptions.CocheEncontrado;
import com.example.divisas.exceptions.CocheYFechaNoEncontrados;
import com.example.divisas.repositories.CocheRepository;
import com.example.divisas.repositories.DivisasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
public class CocheController {

    @Autowired

    private CocheRepository cocheRepository;

    @Autowired

    private DivisasRepository divisasRepository;


    @GetMapping("/api/coches/{fecha}/{matricula}")
    public ResponseEntity<CocheOutput> devuelvePreciosCoche(@PathVariable Date fecha, @PathVariable String matricula)  {


        try {


            if (!cocheRepository.existsByFechaAndMatricula(fecha, matricula)) {

                throw new Exception("El coche y la fecha no se encuentran en la base de datos");

            } else {


                Coche coche=new Coche(cocheRepository.findByMatricula(matricula).getMatricula(),cocheRepository.findByMatricula(matricula).getModelo(),cocheRepository.findByMatricula(matricula).getFecha(),cocheRepository.findByMatricula(matricula).getPrecioEuro());

                Divisas conv=new Divisas(divisasRepository.findByFecha(fecha).getFecha(), divisasRepository.findByFecha(fecha).getEuro(), divisasRepository.findByFecha(fecha).getDolar(), divisasRepository.findByFecha(fecha).getLibra());

                CocheOutput cocheO=new CocheOutput(coche.getMatricula(),coche.getModelo(),coche.getPrecioEuro(),coche.getPrecioEuro()*conv.getDolar(),coche.getPrecioEuro()*conv.getLibra());

                return ResponseEntity.ok(cocheO);

            }


        } catch (CocheYFechaNoEncontrados e3) {

            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).build();


        }   catch (Exception e) {

        return ResponseEntity.badRequest().build();

        }

    }



    @PostMapping("/api/coches")
    public ResponseEntity<String> aniadirCoche(@Valid @RequestBody CocheInput coche) {

        try {
            if(cocheRepository.existsByMatricula(coche.getMatricula())) {
                throw new CocheEncontrado("El coche ya se encuentra en la base de datos.");

            }else{
                cocheRepository.save(coche.toDomain());
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }

        } catch (CocheEncontrado e2) {

            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).build();

        } catch (Exception e) {

            return ResponseEntity.badRequest().build();

        }

    }



}
