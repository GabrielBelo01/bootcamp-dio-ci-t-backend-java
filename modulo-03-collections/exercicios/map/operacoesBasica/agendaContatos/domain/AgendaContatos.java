package map.operacoesBasica.agendaContatos.domain;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome.toLowerCase(),telefone);
    }

    public void removerContato(String nome){
        if(agendaContatoMap.isEmpty()) throw new RuntimeException("Coleção esta vazia");
        agendaContatoMap.remove(nome.toLowerCase());
    }

    public void exibirContatos(){
        agendaContatoMap.forEach((chave, valor) -> System.out.println(chave + " -> " + valor));
    }

    public Integer pesquisarPorNome(String nome){
        if(agendaContatoMap.isEmpty()) throw new RuntimeException("Coleção esta vazia");

        return agendaContatoMap.get(nome.toLowerCase());
    }
}
