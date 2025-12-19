package application;

import domain.FormatadorDeNumero;

public class Programa {
    public static void main(String[] args) {

        String[] testes = {
                "11987654321",
                "987654321",
                "1234-5678",
                "(11)98765-4321",
                "abc11-98765!4321xyz",
                "(119)876-54321",
                "(11)24087625"
        };

        for (String teste : testes) {
            System.out.println(FormatadorDeNumero.formatar(teste));

        }

    }
}
