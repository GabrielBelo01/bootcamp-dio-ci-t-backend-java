package domain;

public class Retangulo implements Formas{

    private int base;
    private int altura;

    public Retangulo(int altura, int base) {
        this.base = base;
        this.altura = altura;
    }



    @Override
    public double calculaForma() {
        return this.base * this.altura;
    }
}
