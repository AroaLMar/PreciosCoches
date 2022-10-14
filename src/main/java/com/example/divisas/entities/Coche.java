package com.example.divisas.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity(name="coches")
public class Coche {


    @Id
    @NotBlank(message =" La matricula del coche está vacia.")
    @NotNull(message = " El matricula del coche es nula")
    private String matricula;
    @NotBlank(message =" El modelo del coche está vacio.")
    @NotNull(message = " El modelo del coche es nulo.")
    private String modelo;
    @NotBlank(message =" La fecha está vacio.")
    @NotNull(message = " La fecha  es nulo.")
    private Date fecha;
    @NotBlank(message =" El precio en euros está vacio.")
    @NotNull(message = " El precio en euros es nulo.")
    private double precioEuro;

    public Coche() {
    }

    public Coche(String matricula, String modelo, Date fecha, double precioEuro) {
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

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha=" + fecha +
                ", precioEuro=" + precioEuro +
                '}';
    }
}
