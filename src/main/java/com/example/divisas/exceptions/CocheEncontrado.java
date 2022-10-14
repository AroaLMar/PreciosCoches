package com.example.divisas.exceptions;

public class CocheEncontrado extends Exception{

    public CocheEncontrado(String message) {

        super("ERROR " + message);

    }
}
