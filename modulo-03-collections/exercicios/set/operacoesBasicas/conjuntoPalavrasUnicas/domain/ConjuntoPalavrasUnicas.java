package set.operacoesBasicas.conjuntoPalavrasUnicas.domain;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> setConjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        setConjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        setConjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(setConjuntoPalavras.isEmpty()) throw new RuntimeException("Lista vazia");

        boolean removido = setConjuntoPalavras.removeIf(p -> p.equalsIgnoreCase(palavra));

        if(!removido) throw new RuntimeException("Palavra nao encontrada");
    }

    public void verificarPalavra(String palavra){
        if(setConjuntoPalavras.stream().anyMatch(p -> p.equalsIgnoreCase(palavra))){
            System.out.println("A palavra: "+palavra+" Existe na lista");
        }
        else {
            System.out.println("A palavra: "+palavra+" Não existe na lista");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(setConjuntoPalavras);
    }
}
