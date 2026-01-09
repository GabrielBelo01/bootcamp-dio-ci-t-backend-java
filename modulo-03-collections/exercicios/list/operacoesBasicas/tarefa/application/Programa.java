package list.operacoesBasicas.tarefa.application;

import list.operacoesBasicas.tarefa.domain.ListaTarefas;

public class Programa {
    public static void main(String[] args) {


        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("list.operacoesBasicas.tarefa 1");
        listaTarefas.adicionarTarefa("list.operacoesBasicas.tarefa 1");
        listaTarefas.adicionarTarefa("list.operacoesBasicas.tarefa 3");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());


//        listaTarefas.removerTarefa("list.operacoesBasicas.tarefa 1");
//        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.updateTarefa("list.operacoesBasicas.tarefa 3", "list.operacoesBasicas.tarefa 8");

        listaTarefas.obterDescricaoTarefas();



    }
}
