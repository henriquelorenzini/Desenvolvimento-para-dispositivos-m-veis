package com.catolica;

public class Retangulo extends Quadrilatero {

    String nome = "Retangulo";



    String nomeSuper = super.getNome();

    @Override
    public String toString() {
        return nome + "->" + nomeSuper;
    }
    @Override
    public String getNome() {
        return nome;
    }
    public String getNomeSuper() {
        return nomeSuper;
    }

}
