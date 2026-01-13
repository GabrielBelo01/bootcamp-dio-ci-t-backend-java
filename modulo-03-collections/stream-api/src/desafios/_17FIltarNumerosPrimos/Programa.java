package desafios._17FIltarNumerosPrimos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Programa {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> n > 1 &&
                        IntStream.rangeClosed(2, (int) Math.sqrt(n))
                                .noneMatch(i -> n % i == 0))
                .forEach(System.out::println);
    }
}
