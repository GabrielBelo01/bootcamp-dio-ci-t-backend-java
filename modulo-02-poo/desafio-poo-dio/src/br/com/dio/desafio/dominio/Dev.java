package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudosIncristos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosIncristos() {
        return conteudosIncristos;
    }

    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(conteudosIncristos, dev.conteudosIncristos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), conteudosIncristos, conteudosConcluidos);
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIncristos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosIncristos.stream().findFirst();

        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIncristos.remove(conteudo.get());
        } else {
            throw new IllegalStateException("Sem Conteudos");
        }
    }

    public double calcularTotalXP(){
        return this.conteudosIncristos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }
}
