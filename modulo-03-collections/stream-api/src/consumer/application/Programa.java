package consumer.application;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,8,8);



       numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

    }
}