package application;

import domain.entity.Carro;
import domain.enums.Direcao;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();

        while (true){

            System.out.println(menu());
            int escolha = sc.nextInt();
            if(escolha == 9) return;
            executarEscolha(escolha, carro);

        }




    }

    private static void executarEscolha(int escolha, Carro carro) {

        switch (escolha){
            case 1: carro.ligarCarro(); break;
            case 2: carro.desligarCarro(); break;
            case 3: carro.passarMarcha(); break;
            case 4: carro.diminuirMarcha(); break;
            case 5: carro.acelerar(); break;
            case 6: carro.diminuir(); break;
            case 7: carro.virar(Direcao.DIREITA); break;
            case 8: carro.virar(Direcao.ESQUERDA); break;
            default:
                System.out.println("Insira um valor de 1 a 9");

        }

    }


    private static String menu() {

        return  """
                ==== Funções do carro ====
                Ligar [1]
                Desligar [2]
                Passar Marcha [3]
                Diminuir Marcha [4]
                Acelerar [5]
                Diminuir [6]
                Virar Direita [7]
                Virar Esquerda [8]
                Sair [9]
                """;

    }
}
