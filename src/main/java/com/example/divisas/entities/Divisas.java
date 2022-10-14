package com.example.divisas.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity(name = "divisas")

public class Divisas {

    @Id
    @NotBlank(message = "La fecha está vacia")
    @NotNull(message = "La fecha es nula")
    private Date fecha;
    @Positive(message = "El precio no puede ser negativo")
    private double euro, dolar, libra;

    public Divisas() {
    }

    public Divisas(Date fecha, double euro, double dolar, double libra) {
        this.fecha = fecha;
        this.euro = euro;
        this.dolar = dolar;
        this.libra = libra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getLibra() {
        return libra;
    }

    public void setLibra(double libra) {
        this.libra = libra;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "fecha=" + fecha +
                ", euro=" + euro +
                ", dolar=" + dolar +
                ", libra=" + libra +
                '}';
    }
}
