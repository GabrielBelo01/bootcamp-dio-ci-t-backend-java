package set.ordenacao.gerenciadorAlunos.domain;

import java.util.HashSet;
import java.util.Set;

public class ListaAlunos {

    private Set<Aluno> conjuntoAluno;

    public ListaAlunos() {
        conjuntoAluno = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        conjuntoAluno.add(new Aluno(nome,matricula,media));
    }

    public void exibirAlunos(){
        conjuntoAluno.forEach(System.out::println);
    }

    public void exibirAlunosPorNome(){
        conjuntoAluno.stream()
                .sorted(new ExibirAlunoPorNome())
                .forEach(System.out::println);
    }

    public void exibirAlunosPorNota(){
        conjuntoAluno.stream()
                .sorted(new ExibirAlunoPorNota().reversed())
                .forEach(System.out::println);
    }
}
