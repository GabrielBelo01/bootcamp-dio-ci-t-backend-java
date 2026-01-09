package map.operacoesBasica.dicionario.application;

import map.operacoesBasica.dicionario.domain.Dicionario;

public class Programa {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavra();


        dicionario.removerPalavra("kotlin");
        dicionario.exibirPalavra();

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");

        System.out.println(dicionario.pesquisarPorPalavra("JAVA"));

    }
}
