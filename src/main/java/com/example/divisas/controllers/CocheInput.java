package com.example.divisas.controllers;

import com.example.divisas.entities.Coche;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class CocheInput {


    //ATRIBUTOS
    @NotBlank(message = "La matricula está vacia.")
    @NotNull(message = "\"La matricula es nula.")
    private String matricula;
    @NotBlank(message = "El modelo está vacio.")
    @NotNull(message = "El modelo es nulo.")
    private String modelo;
    @NotBlank(message =" la fecha está vacio.")
    @NotNull(message = " La fecha es nulo")
    private Date fecha;
    @NotBlank(message =" El precio en Euros está vacio.")
    @NotNull(message = " El precio en Euros es nulo")
    private double precioEuro;


    public CocheInput() {
    }

    public CocheInput(String matricula, String modelo, Date fecha, double precioEuro) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.fecha = fecha;
        this.precioEuro = precioEuro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecioEuro() {
        return precioEuro;
    }

    public void setPrecioEuro(double precioEuro) {
        this.precioEuro = precioEuro;
    }
    
      public Coche toDomain(){



            return new Coche(this.getMatricula(),this.getModelo(),this.getFecha(),this.getPrecioEuro());



        }

       @Override
        public String toString() {
        return "CocheInput{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha=" + fecha +
                ", precioEuro=" + precioEuro +
                '}';
    }
}
