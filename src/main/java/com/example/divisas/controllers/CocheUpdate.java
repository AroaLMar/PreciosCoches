package com.example.divisas.controllers;

import com.example.divisas.entities.Coche;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class CocheUpdate {

    @NotBlank(message = "El modelo está vacio.")
    @NotNull(message = "El modelo es nulo.")
    private String modelo;
    @NotBlank(message =" la fecha está vacio.")
    @NotNull(message = " La fecha es nulo")
    private Date fecha;
    @NotBlank(message =" El precio en Euros está vacio.")
    @NotNull(message = " El precio en Euros es nulo")
    private int precioEuro;

    public CocheUpdate() {
    }

    public CocheUpdate(String modelo, Date fecha, int precioEuro) {
        this.modelo = modelo;
        this.fecha = fecha;
        this.precioEuro = precioEuro;
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

    public int getPrecioEuro() {
        return precioEuro;
    }

    public void setPrecioEuro(int precioEuro) {
        this.precioEuro = precioEuro;
    }

    public Coche toDomain(String matricula){

        return new Coche(matricula,this.getModelo(),this.getFecha(),this.getPrecioEuro());

    }

    @Override
    public String toString() {
        return "CocheUpdate{" +
                "modelo='" + modelo + '\'' +
                ", fecha=" + fecha +
                ", precioEuro=" + precioEuro +
                '}';
    }
}
