package com.catolica;

public class RetanguloTeste {
    public static void main(String[] args) {
        Double comprimento = Double.valueOf(args[0]);
        Double largura = Double.valueOf(args[1]);

        Retangulo retangulo = new Retangulo(comprimento, largura);
        System.out.println(retangulo);
    }
}
