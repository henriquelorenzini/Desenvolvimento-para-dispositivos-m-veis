package com.catolica;

public class PopulacaoMundial {

    public static void main(String[] args) {
        Long populacao = 7000000000L;
        Double taxa = 1.2;
        Integer ano = Integer.valueOf(args [0]);

        Double crescimento = Math.pow((1 + (taxa/100)), ano);
        Double populacaoTotal = populacao * crescimento;

        System.out.println(Math.round(populacaoTotal) + " pessoas");

    }
}



