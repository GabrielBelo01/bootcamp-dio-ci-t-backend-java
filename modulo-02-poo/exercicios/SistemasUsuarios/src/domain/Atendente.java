package domain;

public class Atendente extends  Usuario{

    private double valorCaixa;
    private boolean caixaAberto;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorCaixa = 0;
        this.caixaAberto = true;
    }

    public boolean getCaixaAberto(){
        return caixaAberto;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public void receberPagamento(double valor){
        this.valorCaixa += valor;
    }

    public void fecharCaixa(){
        this.caixaAberto = false;
    }


}
