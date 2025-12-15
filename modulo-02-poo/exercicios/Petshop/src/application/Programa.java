package application;

import domain.MaquinaLavar;
import domain.Petshop;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Petshop petshop = new Petshop(new MaquinaLavar());

        while (true){
            System.out.println(menu());
            int escolha = sc.nextInt();
            if(escolha == 12) return;
            executarEscolha(escolha, petshop);
        }


    }

    private static void executarEscolha(int escolha, Petshop petshop) {

        switch (escolha){
            case 1: petshop.darBanho(); break;
            case 2: petshop.finalizarBanho(); break;
            case 3: petshop.abastecerAgua(); break;
            case 4: petshop.abastecerShampoo(); break;
            case 5: petshop.verificarNivelAgua(); break;
            case 6: petshop.verificarNivelShampoo(); break;
            case 7: petshop.verificarPetNoBanho(); break;
            case 8: petshop.colocarPetNaMaquina(); break;
            case 9: petshop.retirarPetSemBanho(); break;
            case 10: petshop.limparMaquina(); break;
            case 11: petshop.listaBanhos(); break;
            default:
                System.out.println("Valor digitado invalido!");



        }
    }


    public static String menu(){
        return """
                ==== PETSHOP ===
                Dar banho no pet [1]
                finalizar banho [2]
                Abastecer com água [3]
                Abastecer com shampoo [4]
                verificar nivel de água [5]
                verificar nivel de shampoo [6]
                verificar se tem pet no banho [7]
                colocar pet na maquina [8]                   
                retirar pet da máquina sem banho [9]
                limpar maquina[10]
                ver historico de banhos [11]
                Sair [12]
                """;
   }
}
