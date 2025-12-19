package application;

import domain.Alimentacao;
import domain.Cultura;
import domain.Produto;
import domain.SaudeBemEstar;
import domain.Vestuario;

import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Alimentacao(100.0),
                new SaudeBemEstar(200.0),
                new Vestuario(150.0),
                new Cultura(80.0)
        );

        for (Produto p : produtos) {
            System.out.println(p);
        }

    }
}
