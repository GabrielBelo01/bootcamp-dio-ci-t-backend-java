package domain;

public class Gerente extends Usuario{

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void relatorioFinanceiro(Atendente atendente, Vendedor vendedor) {
        if (atendente.getCaixaAberto()) {
            System.out.println("O caixa ainda não foi fechado.");
        } else {
            System.out.println("====Relatorio Financeiro====");
            consultarVendas(vendedor);
            consultarCaixa(atendente);
        }
    }


    public void consultarCaixa(Atendente atendente){
        System.out.println("Total em caixa: R$ "+atendente.getValorCaixa());
    }

    public void consultarVendas(Vendedor vendedor){
        System.out.println("Quantidade de vendas: "+ vendedor.getQuantidadeVendas());
    }







}
