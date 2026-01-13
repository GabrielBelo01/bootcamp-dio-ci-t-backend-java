package desafios._02ImprimirNumerosPares;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Programa {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);




    }
}
