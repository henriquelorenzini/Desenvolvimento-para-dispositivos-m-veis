package com.catolica;

public class Retangulo {
    private Double comprimento;
    private Double largura;

    public Retangulo(Double comprimento, Double largura) {
        this.setComprimento(comprimento);
        this.setLargura(largura);
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getArea() {
        return getComprimento() * getLargura();
    }

    public Double getPerimetro() {
        return (2 * getComprimento()) + (2 * getLargura());
    }

    @Override
    public String toString() {
        String saida = "Area = " + getArea();
        saida += "\nPerimetro = " + getPerimetro();

        return saida;
    }
}
