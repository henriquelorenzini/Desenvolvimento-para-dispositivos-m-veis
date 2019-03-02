package com.catolica;

public class Trapezio extends Quadrilatero {
    String nome = "Trapezio";
    String nomeSuper = super.getNome();

    @Override
    public String toString() {
        return nome + "->" + nomeSuper;
    }


}

