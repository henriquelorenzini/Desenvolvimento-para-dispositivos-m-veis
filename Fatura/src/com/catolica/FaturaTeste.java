package com.catolica;

public class FaturaTeste {
    public static void main(String[] args) {

        String codigo = String.valueOf(args[0]);
        String descricao = String.valueOf(args[1]);
        Integer quantidade = Integer.valueOf(args[2]);
        Double preco = Double.valueOf(args[3]);

        Fatura fatura = new Fatura(codigo, descricao, quantidade, preco);
        System.out.println(fatura);
    }
}
