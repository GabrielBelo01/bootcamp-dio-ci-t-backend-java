package application;

import domain.Circulo;
import domain.Formas;
import domain.Quadrado;
import domain.Retangulo;

public class Programa {
    public static void main(String[] args) {

        Formas quadrado = new Quadrado(5);
        Formas retangulo = new Retangulo(4, 6);
        Formas circulo = new Circulo(3);


        System.out.println("Área do Quadrado: " + quadrado.calculaForma());
        System.out.println("Área do Retângulo: " + retangulo.calculaForma());
        System.out.println("Área do Círculo: " + circulo.calculaForma());
    }
}
