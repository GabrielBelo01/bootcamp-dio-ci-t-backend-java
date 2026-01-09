package map.pesquisa.contagemPalavras.application;

import map.pesquisa.contagemPalavras.domain.ContagemPalavras;

public class Programa {
    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java",14);
        contagemPalavras.adicionarPalavra("PHP",7);
        contagemPalavras.adicionarPalavra("Spring Boot",7);
        contagemPalavras.adicionarPalavra("AWS",2);
        contagemPalavras.adicionarPalavra("HTML",9);
        contagemPalavras.adicionarPalavra("CSS",8);
        contagemPalavras.adicionarPalavra("MySQL",12);
        contagemPalavras.adicionarPalavra("Banco Dados",9);
        contagemPalavras.exibirContagem();

        System.out.println();
        System.out.println("-------");
        System.out.println();
        System.out.println("-------");
        System.out.println();

        contagemPalavras.removerPalavra("HTML");
        contagemPalavras.exibirContagem();

        System.out.println();
        System.out.println("-------");
        System.out.println();
        System.out.println("-------");
        System.out.println();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());


    }
}
