package com.catolica;

public class Paralelogramo extends Quadrilatero {
    String nome = "Paralelogramo";
    String nomeSuper = super.getNome();

    @Override
    public String toString() {
        return nome + "->" + nomeSuper;
    }

}
