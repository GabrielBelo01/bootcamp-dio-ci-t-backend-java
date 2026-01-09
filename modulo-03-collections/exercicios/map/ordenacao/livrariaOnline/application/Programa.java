package map.ordenacao.livrariaOnline.application;

import map.ordenacao.livrariaOnline.domain.LivrariaOnline;

public class Programa {
    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z","1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun","A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6","Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk","Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L","E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4","Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println();
        System.out.println("-------");
        System.out.println();
        System.out.println();
        System.out.println("-------");
        System.out.println();

        livrariaOnline.removerLivro("malorie");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println();
        System.out.println("-------");
        System.out.println();
        System.out.println();
        System.out.println("-------");
        System.out.println();

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("GEORGE Orwell"));
        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.obterLivroMaisBarato());

    }
}
