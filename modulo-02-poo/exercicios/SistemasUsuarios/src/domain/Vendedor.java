package domain;

public class Vendedor extends Usuario{

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }


    public void realizarVendas(){
        this.quantidadeVendas++;
    }

    public int consultarVendas(){
        return getQuantidadeVendas();
    }
}
