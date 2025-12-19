package domain;

public class Quadrado implements Formas{

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public double calculaForma() {
        return this.lado * this.lado;
    }
}
