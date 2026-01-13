package desafios._04RemevendoImpares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        //Primeira forma, Arrays.asList cria uma lista de tamanho fixo
        //Operações que removem ou adicionam elementos não são permitidas
        //Resultado: UnsupportedOperationException
        List<Integer> numeros = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3)
        );
        numeros.removeIf(n -> n % 2 != 0);
        numeros.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();


        //Segunda forma
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();


        //terceiraForma

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .toList();
        System.out.println(pares);

    }
}
