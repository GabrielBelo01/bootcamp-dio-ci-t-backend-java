package list.ordenacao.ordenacaoPessoas.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        listPessoas =  new ArrayList<>();
    }

    public List<Pessoa> getListPessoas() {
        return listPessoas;
    }

    public void adicionarPessoas(String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(listPessoas);
        if(listaOrdenadaPorIdade.isEmpty())  throw new RuntimeException("Lista Vazia!");
        Collections.sort(listaOrdenadaPorIdade);

        return listaOrdenadaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenadaPorAltura = new ArrayList<>(listPessoas);
        if(listaOrdenadaPorAltura.isEmpty())  throw new RuntimeException("Lista Vazia!");
        listaOrdenadaPorAltura.sort(new ordenarPorAltura());
        return listaOrdenadaPorAltura;
    }

}


