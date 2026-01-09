package set.pesquisa.ListaTarefas.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {

    private Set<Tarefa> conjuntoTarefa;

    public ListaTarefas() {
        this.conjuntoTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        conjuntoTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(conjuntoTarefa.isEmpty()) throw new RuntimeException("O Conjunto de tarefas esta Vazio");

        boolean tarefaRemovida = conjuntoTarefa.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));

        if(!tarefaRemovida){
            throw new RuntimeException("Tarefa nao existe");
        }
    }

    public void exibirTarefas(){
        for(var t: conjuntoTarefa){
            System.out.println(t);
        }
    }

    public int contarTarefas(){
        return conjuntoTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        if(conjuntoTarefa.isEmpty()) throw new RuntimeException("O Conjunto de tarefas esta Vazio");

        return conjuntoTarefa.stream()
                .filter(Tarefa::isConcluida)
                .collect(Collectors.toSet());

    }

    public Set<Tarefa> obterTarefasPendentes(){
        if(conjuntoTarefa.isEmpty()) throw new RuntimeException("O Conjunto de tarefas esta Vazio");

        return conjuntoTarefa.stream()
                .filter(t -> !t.isConcluida())
                .collect(Collectors.toSet());

    }

    public void marcarTarefaConcluida(String descricao){
        if(conjuntoTarefa.isEmpty()) throw new RuntimeException("O Conjunto de tarefas esta Vazio");

        boolean encontrada = false;

        for(var t: conjuntoTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) throw new RuntimeException("Tarefa não existe");
    }

    public void marcarTarefaPendente(String descricao){
        if(conjuntoTarefa.isEmpty()) throw new RuntimeException("O Conjunto de tarefas esta Vazio");

        boolean encontrada = false;

        for(var t: conjuntoTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) throw new RuntimeException("Tarefa não existe");
    }

    public void limparListaTarefas(){
        conjuntoTarefa.clear();
    }






}