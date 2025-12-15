package domain.enums;

public enum Marcha {

    PONTO_MORTO(0, 0, 0),
    PRIMEIRA(1, 0, 20),
    SEGUNDA(2, 21, 40),
    TERCEIRA(3, 41, 60),
    QUARTA(4, 61, 80),
    QUINTA(5, 81, 100),
    SEXTA(6, 101, 120);

    private final int numero;
    private final int min;
    private final int max;

    Marcha(int numero, int min, int max) {
        this.numero = numero;
        this.min = min;
        this.max = max;
    }

    public boolean permite(int velocidade) {
        return velocidade >= min && velocidade <= max;
    }

    public int getNumero() {
        return numero;
    }
}

