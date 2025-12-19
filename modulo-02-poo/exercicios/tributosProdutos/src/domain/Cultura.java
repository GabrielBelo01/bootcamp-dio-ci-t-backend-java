package domain;

public class Cultura extends Produto{


    public Cultura(Double valor) {
        super(valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.04;
    }
}
