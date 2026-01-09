package set.pesquisa.agendaContatos.application;

import set.pesquisa.agendaContatos.domain.AgendaContatos;

public class Programa {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gabriel", 999933304);
        agendaContatos.adicionarContato("Gabriel", 993433304);
        agendaContatos.adicionarContato("Gabriel", 991933304);
        agendaContatos.adicionarContato("Hack", 999933304);
        agendaContatos.adicionarContato("Marron Blue", 945933304);
        agendaContatos.adicionarContato("Ice Skin", 91933304);
        agendaContatos.adicionarContato("Leonor", 99433304);
        agendaContatos.exibirContatos();

        System.out.println("------");
        System.out.println();
        System.out.println();
        System.out.println("------");


        System.out.println(agendaContatos.pesquisarPorNome("gabriel"));

        System.out.println("------");
        System.out.println();
        System.out.println();
        System.out.println("------");
        System.out.println(agendaContatos.pesquisarPorNome("Leonor"));
        agendaContatos.atualizarNumeroContato(99433304, 19768017);
        System.out.println(agendaContatos.pesquisarPorNome("Leonor"));
    }
}
