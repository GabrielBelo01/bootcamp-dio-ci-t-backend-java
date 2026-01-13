package supplier.application;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Ola, seja bem-vindo(a)";

        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacao.forEach(System.out::println);
    }
}
