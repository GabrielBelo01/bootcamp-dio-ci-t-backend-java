package set.ordenacao.gerenciadorAlunos.application;

import set.ordenacao.gerenciadorAlunos.domain.ListaAlunos;

public class Programa {
    public static void main(String[] args) {

        ListaAlunos listaAlunos = new ListaAlunos();

        listaAlunos.adicionarAluno("Gabriel",1234L,10.0);
        listaAlunos.adicionarAluno("Marron Blue",3213L,7.0);
        listaAlunos.adicionarAluno("Pink Black",1113L,8.0);
        listaAlunos.adicionarAluno("Pik Black",1113L,8.0);

        listaAlunos.exibirAlunos();

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");

        listaAlunos.exibirAlunosPorNome();

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");

        listaAlunos.exibirAlunosPorNota();


    }
}
