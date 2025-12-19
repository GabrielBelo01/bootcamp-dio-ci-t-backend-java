package domain;

public class Vestuario extends Produto{


    public Vestuario(Double valor) {
        super(valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.025;
    }
}
