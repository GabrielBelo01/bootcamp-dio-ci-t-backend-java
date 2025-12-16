package domain;

import domain.enums.Audio;

public abstract class Ingresso {

    private double valor;
    private String nome;
    private Audio audio;

    public Ingresso(double valor, String nome, Audio audio) {
        this.valor = valor;
        this.nome = nome;
        this.audio = audio;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public Audio getAudio() {
        return audio;
    }


    public abstract double calculoValorIngresso();

}
