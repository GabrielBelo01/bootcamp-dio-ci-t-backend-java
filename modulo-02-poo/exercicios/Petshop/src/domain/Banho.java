package domain;

import java.time.Instant;

public class Banho {

    private static int SEQUENCE = 1;

    private final int id;
    private Instant horaBanho;
    private int quantidadeAgua;
    private int quantidadeShampoo;

    public Banho(Instant horaBanho, int quantidadeAgua, int quantidadeShampoo) {
        this.id = SEQUENCE++;
        this.horaBanho = horaBanho;
        this.quantidadeAgua = quantidadeAgua;
        this.quantidadeShampoo = quantidadeShampoo;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Banho{" +
                "id=" + id +
                ", horaBanho=" + horaBanho +
                ", quantidadeAgua=" + quantidadeAgua +
                ", quantidadeShampoo=" + quantidadeShampoo +
                '}';
    }
}
