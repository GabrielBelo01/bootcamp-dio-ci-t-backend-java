package domain;

public class Circulo implements Formas{

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calculaForma() {
        return Math.PI * Math.pow(raio, 2);
    }
}
