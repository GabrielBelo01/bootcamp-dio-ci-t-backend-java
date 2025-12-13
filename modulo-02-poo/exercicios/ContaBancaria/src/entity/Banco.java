package entity;

public class Banco {


    private double saldo;
    private double chequeEspecial;
    private double chequeUsado;

    public Banco(){}

    public Banco(double saldo) {
        this.saldo = saldo;
        calcularChequeEspecial();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


    public double getChequeUsado() {
        return chequeUsado;
    }

    public void setChequeUsado(double chequeUsado) {
        this.chequeUsado = chequeUsado;
    }

    public double getSaldoTotal() {
        return saldo + chequeEspecial;
    }


    public void verificarSaldo(){
        System.out.println("O Saldo da conta é de: R$ " +this.saldo);
    }

    public void verificarSaldoCheque(){
        System.out.println("O Saldo do cheque especial é de: R$ " +this.chequeEspecial);
    }

    public void verificarSaldoTotal(){
        System.out.println("Saldo total da sua conta é de: R$" + getSaldoTotal());
        verificarSaldo();
        verificarSaldoCheque();
    }

    public void depositar(double valor){
        if(valorNegativo(valor)) return;
        saldo += cobrarTaxaChequeEspecial(valor);
        System.out.println("Depósito realizado: R$ " + valor);
        verificarSaldoTotal();
    }



    public void sacar(double valor){
        if(valorNegativo(valor)) return;
        sistemaSaque(valor);
    }

    public void pagarBoleto(double valor){
        if(valorNegativo(valor)) return;
        sistemaSaque(valor);
    }

    private double cobrarTaxaChequeEspecial(double valorDepositado){
        if (chequeUsado <= 0) return valorDepositado;

        double taxa = chequeUsado * 0.20;
        if (valorDepositado >= taxa) {
            chequeUsado = 0;
            return valorDepositado - taxa;
        } else {
            chequeUsado -= valorDepositado / 1.20;
            return 0;
        }

    }


    private void sistemaSaque(double valor){

        if(valor > getSaldo() + getChequeEspecial()){
            System.out.println("Saldo insuficiente!");
            return;
        }

        if(valor > this.saldo){
            double resto = valor - saldo;
            setSaldo(0);
            setChequeEspecial(this.chequeEspecial -= resto);
            chequeUsado += resto;
        }
        else {
            setSaldo(this.saldo-= valor);
        }

        verificarSaldoTotal();

    }


    private void calcularChequeEspecial() {
        if(saldo <= 500.0){
            setChequeEspecial(50.0);
        }
        else
        {
            setChequeEspecial(saldo / 2);
        }
    }


    private boolean valorNegativo(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return true;
        }
        return false;
    }
}
