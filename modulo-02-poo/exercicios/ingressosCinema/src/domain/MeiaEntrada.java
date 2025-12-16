package domain;

import domain.enums.Audio;

public class MeiaEntrada extends Ingresso{


    public MeiaEntrada(double valor, String nome, Audio audio) {
        super(valor, nome, audio);
    }

    @Override
    public double calculoValorIngresso() {
        return getValor() / 2;
    }
}
