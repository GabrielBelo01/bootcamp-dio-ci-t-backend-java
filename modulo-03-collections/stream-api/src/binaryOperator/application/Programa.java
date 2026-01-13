package binaryOperator.application;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Programa {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);





        System.out.println(numeros.stream()
                .reduce(0, Integer::sum));
    }
}
