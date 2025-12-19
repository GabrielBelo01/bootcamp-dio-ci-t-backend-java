package domain;

public class Alimentacao extends Produto{


    public Alimentacao(Double valor) {
        super(valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.01;
    }
}
