package list.pesquisa.catalagoLivros.domain;



import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

   private final List<Livro> listaLivros;

    public CatalogoLivros(){
        listaLivros = new ArrayList<>();
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }


    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();

        for(var livro: listaLivros){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();

        for(var livro: listaLivros){
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal ){
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for(var livro: listaLivros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }


}
