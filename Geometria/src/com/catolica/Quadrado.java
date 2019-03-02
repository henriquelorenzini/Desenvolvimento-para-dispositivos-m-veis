package com.catolica;

public class Quadrado extends Retangulo {
    String nome = "Quadrado";
    String nomeSuper = super.getNome();

    @Override
    public String toString() {
        return nome + "->" + nomeSuper + "->" + super.getNomeSuper();
    }

}
