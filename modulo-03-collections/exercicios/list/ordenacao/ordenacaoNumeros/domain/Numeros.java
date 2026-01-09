package list.ordenacao.ordenacaoNumeros.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numeros  {

    private List<Integer> listaNumeros;

    public Numeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
         Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDecrescente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.listaNumeros);
         numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public void exibir(){
        System.out.println(this.listaNumeros);
    }
}
