package application;

import domain.Familia;
import domain.Ingresso;
import domain.MeiaEntrada;
import domain.enums.Audio;

public class Programa {

    public static void main(String[] args) {

        Ingresso meia = new MeiaEntrada(40.0, "Matrix", Audio.DUBLADO);
        Ingresso familia = new Familia(30.0, "Vingadores", Audio.LEGENDADO, 4);

        System.out.println("Meia entrada:");
        System.out.println("Filme: " + meia.getNome());
        System.out.println("Valor final: " + meia.calculoValorIngresso());

        System.out.println();

        System.out.println("Ingresso família:");
        System.out.println("Filme: " + familia.getNome());
        System.out.println("Valor final: " + familia.calculoValorIngresso());
    }
}
