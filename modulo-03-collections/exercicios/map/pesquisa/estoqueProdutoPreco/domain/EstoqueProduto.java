package map.pesquisa.estoqueProdutoPreco.domain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private final Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        estoqueProdutoMap = new HashMap<>();
    }

    public Map<Long, Produto> getEstoqueProdutoMap() {
        return estoqueProdutoMap;
    }

    public void adicionarProduto(Long cod, String nome,double preco ,int quantidade){
        estoqueProdutoMap.put(cod, new Produto(nome,preco,quantidade));
    }

    public void exibirProdutos(){
        estoqueProdutoMap.forEach((chave, valor) -> System.out.println(chave + " -> " + valor));
    }

    public double calcularValorTotalEstoque(){
        if(estoqueProdutoMap.isEmpty()) throw new RuntimeException("Conjunto Map Vazio!");

//        double soma = 0d;
//        for(Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()){
//            soma += entry.getValue().getPreco() * entry.getValue().getQuantidade();
//        }
//
//        for(Produto p : estoqueProdutoMap.values()){
//            soma += p.getPreco() * p.getQuantidade();
//        }
//
//        return soma;

        return estoqueProdutoMap.values()
                .stream()
                .mapToDouble(p -> p.getPreco() * p.getQuantidade())
                .sum();
    }

    public Produto obterProdutoMaisCaro(){
//        if(estoqueProdutoMap.isEmpty()) throw new RuntimeException("Conjunto Map Vazio!");

//        Produto produtoMaiorValor = null;
//        double maiorValor = Double.MIN_VALUE;
//        for(Produto p : estoqueProdutoMap.values()){
//            if(p.getPreco() > maiorValor){
//                maiorValor = p.getPreco();
//                produtoMaiorValor = p;
//            }
//        }
//
//        return produtoMaiorValor;

        return estoqueProdutoMap.values()
                .stream()
                .max(Comparator.comparingDouble(Produto::getPreco))
                .orElseThrow(() -> new RuntimeException("Conjunto Map Vazio!"));
    }

    public Produto obterProdutoMaisBarato(){
        return estoqueProdutoMap.values()
                .stream()
                .min(Comparator.comparingDouble(Produto::getPreco))
                .orElseThrow(() -> new RuntimeException("Conjunto Vazio!"));
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
//        if(estoqueProdutoMap.isEmpty()) throw new RuntimeException("Conjunto Map Vazio!");
//
//        Produto produtoMaiorQuantidadeValorTotalEstoque = null;
//        double maiorValor = Double.MIN_VALUE;
//        for(Produto p : estoqueProdutoMap.values()){
//            if(p.getPreco() * p.getQuantidade() > maiorValor){
//                maiorValor = p.getPreco() * p.getQuantidade();
//                produtoMaiorQuantidadeValorTotalEstoque = p;
//            }
//        }
//        return produtoMaiorQuantidadeValorTotalEstoque;

        return estoqueProdutoMap.values()
                .stream()
                .max(Comparator.comparingDouble(p-> p.getQuantidade() * p.getPreco()))
                .orElseThrow(() -> new RuntimeException("Conjunto Vazio!"));
    }
}
