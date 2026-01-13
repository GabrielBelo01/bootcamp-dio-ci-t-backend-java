package predicate.application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Programa {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("javaa", "kotlin", "python", "javascript", "c", "go", "ruby");


        palavras.stream()
                .filter(p -> p.length() >= 5)
                .forEach(System.out::println);


    }
}
