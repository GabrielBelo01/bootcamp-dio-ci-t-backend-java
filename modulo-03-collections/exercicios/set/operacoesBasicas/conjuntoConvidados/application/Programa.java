package set.operacoesBasicas.conjuntoConvidados.application;

import set.operacoesBasicas.conjuntoConvidados.domain.ConjuntoConvidados;

public class Programa {
    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Gabriel", 1);
        conjuntoConvidados.adicionarConvidado("Lucas", 1);
        conjuntoConvidados.adicionarConvidado("Andressa", 3);
        conjuntoConvidados.adicionarConvidado("Maria", 51);
        conjuntoConvidados.adicionarConvidado("Jose", 22);
        conjuntoConvidados.adicionarConvidado("Katia", 61);
        conjuntoConvidados.adicionarConvidado("Beatriz", 9);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
