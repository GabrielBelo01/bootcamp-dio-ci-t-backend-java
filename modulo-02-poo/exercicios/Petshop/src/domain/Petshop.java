package domain;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Petshop {

    private final MaquinaLavar maquina;
    private List<Banho> historicoBanhos = new ArrayList<>();

    public Petshop(MaquinaLavar maquina) {
        this.maquina = maquina;
    }

    public void colocarPetNaMaquina() {
        maquina.colocarPet();
    }

    public void darBanho() {
        maquina.iniciarBanho();
    }

    public void finalizarBanho() {
        maquina.finalizarBanho();
        addHistoricoBanho(10, 2);
    }

    public void retirarPetSemBanho() {
        maquina.retirarPetSemBanho();
    }

    public void limparMaquina() {
        maquina.limpar();
    }

    public void abastecerAgua() {
        maquina.abastecerAgua();
    }

    public void abastecerShampoo() {
        maquina.abastecerShampoo();
    }

    public void verificarNivelAgua(){
        System.out.println("Nivel de agua: "+maquina.getAgua());
    }

    public void verificarNivelShampoo(){
        System.out.println("Nivel de shampoo: "+maquina.getShampoo());
    }

    public void verificarPetNoBanho(){
        if(maquina.temPetEmBanho()){
            System.out.println("Pet em banho!");
        }
        else{
            System.out.println("Não há pet no banho!");
        }
    }

    private void addHistoricoBanho(int agua, int shampoo) {
        historicoBanhos.add(
                new Banho(Instant.now(), agua, shampoo)
        );
    }

    public void listaBanhos(){
        for(Banho b: historicoBanhos){
            System.out.println(b);
        }
    }
}
