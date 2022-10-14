package com.example.divisas.exceptions;

public class CocheYFechaNoEncontrados extends Exception{

    public CocheYFechaNoEncontrados(String message) {

        super("ERROR " + message);

    }
}
