package list.operacoesBasicas.tarefa.domain;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> listaTarefas = new ArrayList<>();


    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }


    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover =  new ArrayList<>();


        for(Tarefa tarefa: listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }

            listaTarefas.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(listaTarefas);
    }


    public void updateTarefa(String descricao, String novaDescricao){
        removerTarefa(descricao);
        adicionarTarefa(novaDescricao);
    }


}
