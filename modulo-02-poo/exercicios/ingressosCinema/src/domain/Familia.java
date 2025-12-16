package domain;

import domain.enums.Audio;

public class Familia extends Ingresso{

    private int numeroPessoas;

    public Familia(double valor, String nome, Audio audio, int numeroPessoas) {
        super(valor, nome, audio);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double calculoValorIngresso() {
        if(this.numeroPessoas > 3){
            return (this.numeroPessoas * getValor()) * 0.95;
        }

        return this.numeroPessoas * getValor();
    }

}
