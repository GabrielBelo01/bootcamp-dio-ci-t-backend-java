package set.pesquisa.ListaTarefas.application;

import set.pesquisa.ListaTarefas.domain.ListaTarefas;

public class Programa {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Fazer Compras");
        listaTarefas.adicionarTarefa("Arrumar o Quarto");
        listaTarefas.adicionarTarefa("Limpar a Sala");
        listaTarefas.adicionarTarefa("Codar 30 minutos");
        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.adicionarTarefa("ir a academia");
        listaTarefas.adicionarTarefa("Corrida");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        System.out.println("--------");
        System.out.println();
        System.out.println();
        System.out.println("--------");

        listaTarefas.removerTarefa("Fazer compras");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());

        System.out.println("--------");
        System.out.println();
        System.out.println();
        System.out.println("--------");

        System.out.println(listaTarefas.obterTarefasPendentes());



        listaTarefas.marcarTarefaConcluida("codar 30 minutos");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("--------");
        System.out.println();
        System.out.println();
        System.out.println("--------");

        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.limparListaTarefas();
        System.out.println(listaTarefas.contarTarefas());

    }
}
