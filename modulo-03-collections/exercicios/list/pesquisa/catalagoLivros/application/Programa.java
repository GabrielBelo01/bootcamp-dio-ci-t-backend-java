package list.pesquisa.catalagoLivros.application;

import list.pesquisa.catalagoLivros.domain.CatalogoLivros;


public class Programa {
    public static void main(String[] args) {

        CatalogoLivros catalagoLivros = new CatalogoLivros();

        catalagoLivros.adicionarLivro("Arsene Lupin", "Maurice Leblanc", 1912);
        catalagoLivros.adicionarLivro("Java P/ Iniciantes", "Nelio Alves", 2020);
        catalagoLivros.adicionarLivro("Java P/ Avancados", "Nelio Alves", 2023);
        catalagoLivros.adicionarLivro("Spring Boot", "DevDojo", 2018);

        System.out.println(catalagoLivros.pesquisarPorTitulo("Java p/ iniciantes"));

    }
}
