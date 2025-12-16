package application;

import domain.Atendente;
import domain.Gerente;
import domain.Vendedor;

public class Application {

    public static void main(String[] args) {


        Gerente gerente = new Gerente("Carlos", "carlos@empresa.com", "123");
        Vendedor vendedor = new Vendedor("Ana", "ana@empresa.com", "456");
        Atendente atendente = new Atendente("João", "joao@empresa.com", "789");

        System.out.println(gerente.login("carlos@empresa.com", "123"));
        System.out.println(vendedor.login("ana@empresa.com", "456"));
        System.out.println(atendente.login("joao@empresa.com", "789"));


        vendedor.realizarVendas();
        vendedor.realizarVendas();


        atendente.receberPagamento(100.0);
        atendente.receberPagamento(50.0);

        gerente.relatorioFinanceiro(atendente, vendedor);
        atendente.fecharCaixa();


        gerente.relatorioFinanceiro(atendente, vendedor);


        System.out.println(gerente.logoff());
        System.out.println(vendedor.logoff());
        System.out.println(atendente.logoff());
    }
}
