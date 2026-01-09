package set.ordenacao.cadastroProtudos.application;

import set.ordenacao.cadastroProtudos.domain.CadastroProduto;

public class Programa {
    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1123,"Banana",2.99,4);
        cadastroProduto.adicionarProduto(13123,"Maionse",14.67,7);
        cadastroProduto.adicionarProduto(2234, "Arroz", 18.90, 10);
        cadastroProduto.adicionarProduto(3345, "Feijao", 9.49, 6);
        cadastroProduto.adicionarProduto(4456, "Macarrao", 5.79, 8);
        cadastroProduto.adicionarProduto(5567, "Leite", 4.89, 12);
        cadastroProduto.adicionarProduto(6678, "Cafe", 15.99, 3);
        cadastroProduto.adicionarProduto(7789, "Acucar", 3.99, 9);
        cadastroProduto.adicionarProduto(8890, "Sal", 2.49, 15);
        cadastroProduto.adicionarProduto(9901, "Oleo", 7.89, 5);
        cadastroProduto.adicionarProduto(10112, "Manteiga", 11.59, 4);
        cadastroProduto.adicionarProduto(11123, "Pao", 6.29, 20);

        cadastroProduto.exibirProdutosPorNome();
        System.out.println("------");
        System.out.println();
        System.out.println();
        System.out.println("------");
        cadastroProduto.exibirProdutosPorPreco();

    }
}
