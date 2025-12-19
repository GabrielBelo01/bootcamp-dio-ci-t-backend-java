package domain;

public class SaudeBemEstar extends Produto{


    public SaudeBemEstar(Double valor) {
        super(valor);
    }

    @Override
    public double calcularImposto() {
        return getValor() * 0.015;
    }
}
