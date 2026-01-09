package list.ordenacao.ordenacaoNumeros.application;

import list.ordenacao.ordenacaoNumeros.domain.Numeros;

public class Programa {
    public static void main(String[] args) {

            // Criando uma instância da classe OrdenacaoNumeros
            Numeros numeros = new Numeros();

            // Adicionando números à lista
            numeros.adicionarNumero(2);
            numeros.adicionarNumero(5);
            numeros.adicionarNumero(4);
            numeros.adicionarNumero(1);
            numeros.adicionarNumero(99);

            // Exibindo a lista de números adicionados
            numeros.exibir();

            // Ordenando e exibindo em ordem ascendente
            System.out.println(numeros.ordenarAscendente());

            // Exibindo a lista
            numeros.exibir();

            // Ordenando e exibindo em ordem descendente
            System.out.println(numeros.ordenarDecrescente());

            // Exibindo a lista
            numeros.exibir();




    }
}
