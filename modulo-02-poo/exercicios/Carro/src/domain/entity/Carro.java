
package domain.entity;

import domain.enums.Direcao;
import domain.enums.Marcha;

public class Carro {

    private boolean isLigado;
    private int velocidade;
    private Marcha marcha;

    public Carro() {
        this.isLigado = false;
        this.velocidade = 0;
        marcha = Marcha.PONTO_MORTO;
    }


    public void ligarCarro() {
        if (this.isLigado) {
            System.out.println("O Carro Ja esta ligado! ");
            return;
        }

        System.out.println("O Carro foi ligado! ");
        this.isLigado = true;
    }

    public void desligarCarro() {
        if (!this.isLigado) {
            System.out.println("O Carro ja esta desligado");
            return;
        }

        if (marcha == Marcha.PONTO_MORTO && velocidade == 0) {
            isLigado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("Erro ao desligar!");
        }



    }


    public void virar(Direcao direcao) {
        if (!validarCarroLigado()) return;

        if(velocidade > 0 && velocidade <= 40){
            System.out.println("Virando para " + direcao);
        }

    }

    public void acelerar() {
        if (!validarCarroLigado()) return;

        if (marcha == Marcha.PONTO_MORTO) {
            System.out.println("Carro em ponto morto");
            return;
        }

        if (velocidade == 120) {
            System.out.println("Velocidade máxima atingida");
            return;
        }

        int novaVelocidade = velocidade + 1;

        if (!marcha.permite(novaVelocidade)) {
            System.out.println("Troque a marcha!");
            return;
        }

        velocidade = novaVelocidade;
        System.out.println("Velocidade: " + velocidade);
    }



    public void diminuir() {
        if (!validarCarroLigado()) return;

        if (velocidade == 0) {
            System.out.println("Velocidade mínima atingida");
            return;
        }

        velocidade--;
        System.out.println("Velocidade: " + velocidade);
    }


    public void passarMarcha() {
        if (!validarCarroLigado()) return;

        if (marcha == Marcha.SEXTA) {
            System.out.println("Já está na última marcha");
            return;
        }

        marcha = Marcha.values()[marcha.ordinal() + 1];
        System.out.println("Marcha atual: " + marcha);
    }

    public void diminuirMarcha() {
        if (!validarCarroLigado()) return;

        if (marcha == Marcha.PONTO_MORTO) {
            System.out.println("Já está no ponto morto");
            return;
        }

        marcha = Marcha.values()[marcha.ordinal() - 1];
        System.out.println("Marcha atual: " + marcha);
    }



    private boolean validarCarroLigado() {
        if (!isLigado) {
            System.out.println("Ligue o carro primeiro!");
            return false;
        }
        return true;
    }


}
