package list.ordenacao.ordenacaoPessoas.application;

import list.ordenacao.ordenacaoPessoas.domain.OrdenacaoPessoas;


import java.util.Comparator;



public class Programa {

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoas("Gabriel",23,1.83);
        ordenacaoPessoas.adicionarPessoas("Anderson",24,1.53);
        ordenacaoPessoas.adicionarPessoas("Mauro",53,1.67);
        ordenacaoPessoas.adicionarPessoas("Andressa",28,1.53);
        ordenacaoPessoas.adicionarPessoas("Vilma",37,1.73);

        System.out.println("=======IDADE======");
        System.out.println(ordenacaoPessoas.getListPessoas());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println();
        System.out.println();


        System.out.println("=======Altura======");
        System.out.println(ordenacaoPessoas.getListPessoas());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}
