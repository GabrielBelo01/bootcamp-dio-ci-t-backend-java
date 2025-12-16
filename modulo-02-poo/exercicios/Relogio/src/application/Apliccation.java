package application;

import domain.Relogio;
import domain.RelogioAmericano;
import domain.RelogioBrasileiro;

public class Apliccation {
    public static void main(String[] args) {

        Relogio brasileiro = new RelogioBrasileiro();
        brasileiro.setHora(18);
        brasileiro.setMinuto(30);
        brasileiro.setSegundo(45);

        Relogio americano = new RelogioAmericano();
        americano.ajustarHorario(brasileiro);

        System.out.println("Horário BR: " + brasileiro.getHorarioFormatado());
        System.out.println("Horário EUA: " + americano.getHorarioFormatado());
    }
}

