package com.example.divisas.controllers;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class CocheOutput {

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
    @NotBlank(message =" El precio en dolares está vacio.")
    @NotNull(message = " El precio en dolares es nulo")
    private double precioDolar;
    @NotBlank(message =" El precio en libras está vacio.")
    @NotNull(message = " El precio en libras es nulo")
    private double precioLibra;

    public CocheOutput() {
    }

    public CocheOutput(String matricula, String modelo, double precioEuro, double precioDolar, double precioLibra) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.precioEuro = precioEuro;
        this.precioDolar = precioDolar;
        this.precioLibra = precioLibra;
    }


    public String getMatricula() {
        return matricula;
    }


    public String getModelo() {
        return modelo;
    }


    public Date getFecha() {
        return fecha;
    }


    public double getPrecioEuro() {
        return precioEuro;
    }


    public double getPrecioDolar() {
        return precioDolar;
    }



    public double getPrecioLibra() {
        return precioLibra;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setPrecioEuro(double precioEuro) {
        this.precioEuro = precioEuro;
    }

    public void setPrecioDolar(double precioDolar) {
        this.precioDolar = precioDolar;
    }

    public void setPrecioLibra(double precioLibra) {
        this.precioLibra = precioLibra;
    }

    @Override
    public String toString() {
        return "CocheOutput{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha=" + fecha +
                ", precioEuro=" + precioEuro +
                ", precioDolar=" + precioDolar +
                ", precioLibra=" + precioLibra +
                '}';
    }
}
