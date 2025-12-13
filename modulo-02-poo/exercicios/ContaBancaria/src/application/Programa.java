package application;

import entity.Banco;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco conta = new Banco(600.00);


        while(true) {

            System.out.println(menu());
            int escolha = sc.nextInt();

            if (escolha == 7) break;

            verificadorEscolha(escolha, conta, sc);

            }

    }

    public static String menu (){
      return     """
                    ====== BEM VINDO AO BANCO PIG BANK =======
                    Escolha sua opção:
                    Consultar Saldo Total: [1]
                    Consultar Saldo: [2] 
                    Consultar Cheque Especial: [3] 
                    Saque: [4] 
                    Deposito: [5] 
                    Pagar boleto: [6]
                    Sair: [7]
                    """;
    }





    private static void verificadorEscolha(int escolha, Banco conta, Scanner sc) {
        switch (escolha){

            case 1:{
                conta.verificarSaldoTotal();
                break;
            }

            case 2:{
                conta.verificarSaldo();
                break;
            }

            case 3:{
                conta.verificarSaldoCheque();
                break;
            }

            case 4:{
                conta.verificarSaldoTotal();
                System.out.println("Valor saque: ");
                conta.sacar(sc.nextDouble());
                break;
            }

            case 5:{
                System.out.println("Valor Deposito: ");
                conta.depositar(sc.nextDouble());
                break;
            }

            case 6:{
                conta.verificarSaldoTotal();
                System.out.println("Valor do boleto a ser pago: ");
                conta.pagarBoleto(sc.nextDouble());
                break;

            }

            default:{
                System.out.println("Insira valores de 1 a 7!");
            }

            System.out.println();
    }


}
}

