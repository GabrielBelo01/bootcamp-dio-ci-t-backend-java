package map.ordenacao.livrariaOnline.domain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LivrariaOnline {

    private final Map<String, Livro> conjuntoLivrosMap;

    public LivrariaOnline() {
        conjuntoLivrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        conjuntoLivrosMap.put(link, new Livro(titulo,autor,preco));
    }

    public void removerLivro(String titulo){
        if(conjuntoLivrosMap.isEmpty()) throw new RuntimeException("Cojunto Map Vazio!");

        conjuntoLivrosMap.entrySet()
                .removeIf( e -> e.getValue().getTitulo().equalsIgnoreCase(titulo));
    }

    public void exibirLivrosOrdenadosPorPreco(){
        if(conjuntoLivrosMap.isEmpty()) throw new RuntimeException("Cojunto Map Vazio!");

        conjuntoLivrosMap.values()
                .stream()
                .sorted(new LivrosOrdenadosPorPreco())
                .forEach(System.out::println);
    }

    public Set<Livro> pesquisarLivrosPorAutor(String autor){
        if (conjuntoLivrosMap.isEmpty()) throw new RuntimeException("Conjunto Map Vazio!");

      return   conjuntoLivrosMap.values()
                .stream()
                .filter(l -> l.getAutor().equalsIgnoreCase(autor))
              .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Livro::getPreco))));
    }

    public Livro obterLivroMaisCaro(){
        return conjuntoLivrosMap.values()
                .stream()
                .max(Comparator.comparingDouble(Livro::getPreco))
                .orElseThrow(() -> new RuntimeException("Lista Vazia"));
    }


    public Livro obterLivroMaisBarato(){
        return conjuntoLivrosMap.values()
                .stream()
                .min(Comparator.comparingDouble(Livro::getPreco))
                .orElseThrow(() -> new RuntimeException("Lista Vazia"));
    }

}
