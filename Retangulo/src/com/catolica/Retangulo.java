package com.catolica;

public class Retangulo {
    private Double comprimento = 1.0;
    private Double largura = 1.0;

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
    public boolean checkValores(){
        if (comprimento == 0 || largura == 0) {
            return false;
        }else{
            return true;
        }
    }
    @Override
    public String toString() {
        String saida;
        if (checkValores()){
            saida = "Area = " + getArea();
            saida += "\nPerimetro = " + getPerimetro();

        }else{
            saida = "Valor inválido";
        }
        return saida;
    }
}
