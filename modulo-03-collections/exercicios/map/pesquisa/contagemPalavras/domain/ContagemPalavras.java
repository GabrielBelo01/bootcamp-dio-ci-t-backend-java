package map.pesquisa.contagemPalavras.domain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private final Map<String, Integer> cojuntoPalavrasMap;

    public ContagemPalavras() {
        cojuntoPalavrasMap = new HashMap<>();
    }

    public Map<String, Integer> getCojuntoPalavrasMap() {
        return cojuntoPalavrasMap;
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        cojuntoPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(cojuntoPalavrasMap.isEmpty()) throw new RuntimeException("Conjunto Map Vazio");
        if(!cojuntoPalavrasMap.containsKey(palavra)) throw new RuntimeException("Palavra nao encontrada no conjunto");

        cojuntoPalavrasMap.remove(palavra);

    }

    public void exibirContagem(){
        cojuntoPalavrasMap.forEach((palavra, contagem) -> System.out.println(palavra + " -> " + contagem));
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){

        return cojuntoPalavrasMap.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElseThrow(() -> new RuntimeException("Cojunto Vazio!"));


    }


}
