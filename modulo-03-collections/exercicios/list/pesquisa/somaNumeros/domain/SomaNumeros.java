package list.pesquisa.somaNumeros.domain;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero){
        listaNumeros.add(numero);
    }

    public Integer calcularSoma(){
        if(listaNumeros.isEmpty()) throw new RuntimeException("Lista Vazia");

        int soma = 0;
        for(Integer numero: listaNumeros){
            soma += numero;
        }

        return soma;
    }

    public Integer encontrarMaiorNumero(){
        if(listaNumeros.isEmpty()) throw new RuntimeException("Lista Vazia");

        Integer maiorNumero = listaNumeros.getFirst();
        for(Integer numero: listaNumeros){
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public Integer encontrarMenorNumero(){
        if(listaNumeros.isEmpty()) throw new RuntimeException("Lista Vazia");


        Integer menorNumero = listaNumeros.getFirst();
        for (Integer numero: listaNumeros){
            if(numero < menorNumero){
                menorNumero = numero;
            }
        }

        return menorNumero;
    }

    public void exibirNumeros(){
        for(Integer numero: listaNumeros){
            System.out.println(numero);
        }
    }
}
