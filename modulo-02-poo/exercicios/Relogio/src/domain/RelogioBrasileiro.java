package domain;

public class RelogioBrasileiro extends Relogio {

    @Override
    public void ajustarHorario(Relogio relogio) {
        setHora(relogio.getHora());
        setMinuto(relogio.getMinuto());
        setSegundo(relogio.getSegundo());
    }
}
