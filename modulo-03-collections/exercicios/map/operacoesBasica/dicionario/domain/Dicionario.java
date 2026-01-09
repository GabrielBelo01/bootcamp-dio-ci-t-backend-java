package map.operacoesBasica.dicionario.domain;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String, String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<>();
    }

    public Map<String, String> getDicionario() {
        return dicionario;
    }


    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra.toLowerCase(),definicao);
    }

    public void removerPalavra(String palavra){
        if(dicionario.isEmpty()) throw new RuntimeException("Map Vazio");
        dicionario.remove(palavra.toLowerCase());
    }

    public void exibirPalavra(){
        dicionario.forEach((palavra, definicao) -> System.out.println(palavra + " -> " + definicao));
    }

    public String pesquisarPorPalavra(String palavra){
        return dicionario.get(palavra.toLowerCase());
    }

}
