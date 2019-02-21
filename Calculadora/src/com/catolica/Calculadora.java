package com.catolica;

public class Calculadora {
    public static void main(String[] args) {
        Integer numero1 = Integer.valueOf(args[0]);
        Integer numero2 = Integer.valueOf(args[1]);

        //Soma
        Integer soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);

        //Multiplicação
        Integer multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação é: " + multiplicacao);

        //Subtração
        Integer subtracao = numero1 - numero2;
        System.out.println("A diferença é: " + subtracao);

        //Divisão
        Double divisao = (double) numero1 / (double) numero2;
        System.out.println("A divisão é: " + divisao);
        //Maior
        if (numero1 > numero2) {
            System.out.println("O maior número é " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior numero é " + numero2);
        } else {
            System.out.println("Os valores são iguais");
        }
    }
}
