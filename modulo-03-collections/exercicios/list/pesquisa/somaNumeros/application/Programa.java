package list.pesquisa.somaNumeros.application;

import list.pesquisa.somaNumeros.domain.SomaNumeros;

public class Programa {
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(54);
        somaNumeros.adicionarNumero(312);
        somaNumeros.adicionarNumero(21);
        somaNumeros.adicionarNumero(55);
        somaNumeros.adicionarNumero(99);
        somaNumeros.adicionarNumero(81);
        somaNumeros.adicionarNumero(90);
        somaNumeros.adicionarNumero(37);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();

    }
}
