package com.catolica;

public class Triangulo {

    public static void main(String[] args) {
        String letra = String.valueOf(args[0]);
        Integer tamanho = Integer.valueOf(args[1]);

        System.out.println("Tamanho do triangulo: " + tamanho + " " + "Tipo do triangulo: " + letra);

        switch (letra) {
            case "a":
                trianguloA(tamanho);
                break;
            case "b":
                trianguloB(tamanho);
                break;
            case "c":
                trianguloC(tamanho);
                break;
            case "d":
                trianguloD(tamanho);
                break;
            default:
                break;
        }
    }


    private static void trianguloA(Integer tamanho) {
        for (Integer i = 1; i <= tamanho; i++) {
            for (Integer j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void trianguloB(Integer tamanho) {
        for (Integer i = tamanho; i >= 1; i--) {
            for (Integer j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void trianguloC(Integer tamanho) {
        for (Integer i = tamanho; i >= 1; i--) {
            for (Integer j = 0; j < (tamanho - i); j++) {
                System.out.print(" ");
            }
            for (Integer j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void trianguloD(Integer tamanho) {
        for (Integer i = 1; i <= tamanho; i++) {
            for (Integer j = 0; j < (tamanho - i); j++) {
                System.out.print(" ");
            }
            for (Integer j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


