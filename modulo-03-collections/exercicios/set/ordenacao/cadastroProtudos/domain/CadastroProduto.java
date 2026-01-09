package set.ordenacao.cadastroProtudos.domain;

import java.util.HashSet;
import java.util.Set;


public class CadastroProduto {

    private final Set<Produto> conjuntoProduto;

    public CadastroProduto() {
        conjuntoProduto = new HashSet<>();
    }

    public Set<Produto> getConjuntoProduto() {
        return conjuntoProduto;
    }


    public void adicionarProduto(int codigo, String nome, double preco, int quantidade){
        conjuntoProduto.add(new Produto(nome,codigo,preco,quantidade));
    }

    public void exibirProdutosPorNome(){
//        List<Produto> listaProdutosPorNome = new ArrayList<>(conjuntoProduto);
//        listaProdutosPorNome.sort(new ExibirProdutosPorNome());
//        return listaProdutosPorNome;

      conjuntoProduto.stream()
                .sorted(new ExibirProdutosPorNome())
                .forEach(System.out::println);
    }

    public void exibirProdutosPorPreco(){
//        List<Produto> listaProdutosPorPreco = new ArrayList<>(conjuntoProduto);
//        listaProdutosPorPreco.sort(new ExibirProdutosPorPreco());
//        return listaProdutosPorPreco;

        conjuntoProduto.stream()
                .sorted(new ExibirProdutosPorPreco().reversed())
                .forEach(System.out::println);
    }


}


