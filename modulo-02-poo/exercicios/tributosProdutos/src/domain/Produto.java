package domain;

public abstract class Produto implements ProdutosInterface{
    private Double valor;

    public Produto(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto: " + this.getClass().getSimpleName() +
                ", Valor: " + getValor() +
                ", Imposto: " + calcularImposto();
    }

}
