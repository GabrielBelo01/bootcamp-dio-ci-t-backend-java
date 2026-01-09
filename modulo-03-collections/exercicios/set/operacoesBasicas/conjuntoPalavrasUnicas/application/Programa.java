package set.operacoesBasicas.conjuntoPalavrasUnicas.application;

import set.operacoesBasicas.conjuntoPalavrasUnicas.domain.ConjuntoPalavrasUnicas;

public class Programa {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Pao");
        conjuntoPalavrasUnicas.adicionarPalavra("Pao");
        conjuntoPalavrasUnicas.adicionarPalavra("Ovo");
        conjuntoPalavrasUnicas.adicionarPalavra("Ovo");
        conjuntoPalavrasUnicas.adicionarPalavra("Salada");
        conjuntoPalavrasUnicas.adicionarPalavra("Feijao");
        conjuntoPalavrasUnicas.adicionarPalavra("Macarrao");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("--------");
        System.out.println();
        System.out.println();
        System.out.println("--------");

        conjuntoPalavrasUnicas.removerPalavra("ovo");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("feijao");

    }
}
