package map.ordenacao.livrariaOnline.domain;

import java.util.Comparator;

public class Livro {

    private String titulo;

    private String autor;

    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}

class LivrosOrdenadosPorPreco implements Comparator<Livro>{

    @Override
    public int compare(Livro o1, Livro o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}
//class LivrosOrdenadosPorPreco implements Comparator<Map <String, Livro>>{
//
//    @Override
//    public int compare(Map<String, Livro> o1, Map<String, Livro> o2) {
//        return Double.compare()
//    }
//}
