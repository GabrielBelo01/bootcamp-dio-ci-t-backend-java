package domain;

import enums.EstadoMaquina;


public class MaquinaLavar {

    private int agua;
    private int shampoo;
    private EstadoMaquina estado;


    public MaquinaLavar() {
        this.agua = 0;
        this.shampoo = 0;
        this.estado = EstadoMaquina.LIVRE;
    }


    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public EstadoMaquina getEstado() {
        return estado;
    }


    public void colocarPet() {
        if (this.estado != EstadoMaquina.LIVRE) {
            System.out.println("Máquina não está livre");
            return;
        }
        this.estado = EstadoMaquina.COM_PET;
        System.out.println("Pet colocado na maquina");
    }


    public void iniciarBanho() {
        if (this.estado != EstadoMaquina.COM_PET) {
            System.out.println("Não há pet para banho");
            return;
        }
        if (this.agua < 10 || this.shampoo < 2) {
            System.out.println("Recursos insuficientes");
            return;
        }

        System.out.println("Banho Iniciado");
        this.agua -= 10;
        this.shampoo -= 2;
        this.estado = EstadoMaquina.EM_BANHO;
    }

    public void finalizarBanho() {
        if (this.estado != EstadoMaquina.EM_BANHO) {
            System.out.println("Banho não iniciado");
            return;
        }
        System.out.println("Banho Finalizado");
        this.estado = EstadoMaquina.LIVRE;
    }

    public void retirarPetSemBanho() {
        if (this.estado != EstadoMaquina.COM_PET) {
            System.out.println("Não há pet para retirar");
            return;
        }
        this.estado = EstadoMaquina.SUJA;
        System.out.println("Pet retirado sem lavar!");
    }

    public void limpar() {
        if (this.estado != EstadoMaquina.SUJA) {
            System.out.println("Máquina não precisa de limpeza");
            return;
        }
        if (this.agua < 3 || this.shampoo < 1) {
            System.out.println("Recursos insuficientes para limpeza");
            return;
        }

        this.agua -= 3;
        this.shampoo -= 1;
        this.estado = EstadoMaquina.LIVRE;
    }


    public void abastecerAgua() {
        if (this.agua + 2 > 30) {
            System.out.println("Limite máximo de água");
            return;
        }
        System.out.println("Abastecido 2 litros de agua");
        this.agua += 2;
        System.out.println("Total de: "+this.agua);
    }

    public void abastecerShampoo() {
        if (this.shampoo + 2 > 10) {
            System.out.println("Limite máximo de shampoo");
            return;
        }
        System.out.println("Abastecido 2 litros de shampoo");
        this.shampoo += 2;
        System.out.println("Total de: "+this.shampoo);
    }

    public boolean temPetEmBanho() {
        return estado == EstadoMaquina.EM_BANHO;
    }







}
