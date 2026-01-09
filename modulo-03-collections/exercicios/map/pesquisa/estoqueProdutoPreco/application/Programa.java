package map.pesquisa.estoqueProdutoPreco.application;

import map.pesquisa.estoqueProdutoPreco.domain.EstoqueProduto;

public class Programa {
    public static void main(String[] args) {

       EstoqueProduto estoqueProduto = new EstoqueProduto();

       estoqueProduto.adicionarProduto(113L, "Teclado", 190.0d, 10);
       estoqueProduto.adicionarProduto(101L, "Mouse", 50.0d, 15);
       estoqueProduto.adicionarProduto(102L, "Monitor", 1200.0d, 5);
       estoqueProduto.adicionarProduto(103L, "Notebook", 3500.0d, 3);
       estoqueProduto.adicionarProduto(104L, "Teclado Mecânico", 250.0d, 8);
       estoqueProduto.adicionarProduto(105L, "Fone de Ouvido", 180.0d, 12);
       estoqueProduto.adicionarProduto(106L, "Webcam", 300.0d, 6);
       estoqueProduto.adicionarProduto(107L, "HD Externo", 450.0d, 4);
       estoqueProduto.adicionarProduto(108L, "Pen Drive", 60.0d, 20);
       estoqueProduto.adicionarProduto(109L, "Caixa de Som", 350.0d, 7);
       estoqueProduto.adicionarProduto(110L, "Cadeira Gamer", 950.0d, 2);
       estoqueProduto.adicionarProduto(111L, "LED", 10d, 1000);
       estoqueProduto.exibirProdutos();

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");


        System.out.println("Valor total estoque: ");
        System.out.println(estoqueProduto.calcularValorTotalEstoque());

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");

        System.out.println("Produto mais caro");
        System.out.println(estoqueProduto.obterProdutoMaisCaro());

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");

        System.out.println("Produto mais barato");
        System.out.println(estoqueProduto.obterProdutoMaisBarato());

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");

        System.out.println("Produto com maior valor em estoque");
        System.out.println(estoqueProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
