package desafios._11SomaQuadrado;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       numeros.stream()
               .map(n -> n * 2)
               .reduce(Integer::sum)
               .ifPresent(System.out::println);
    }
}
