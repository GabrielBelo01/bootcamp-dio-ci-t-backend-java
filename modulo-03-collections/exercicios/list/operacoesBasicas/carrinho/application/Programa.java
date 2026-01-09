package list.operacoesBasicas.carrinho.application;

import list.operacoesBasicas.carrinho.domain.CarrinhoDeCompras;

public class Programa {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibisItens();

        carrinhoDeCompras.adiconarItem("Pao", 5, 2);
        carrinhoDeCompras.adiconarItem("Ovo", 10, 3);
        carrinhoDeCompras.adiconarItem("Queijo", 30, 1);
        carrinhoDeCompras.adiconarItem("Carne", 45, 1);

        carrinhoDeCompras.exibisItens();
        carrinhoDeCompras.calcularValoTotal();

        carrinhoDeCompras.removerItem("Pao");
        carrinhoDeCompras.exibisItens();
        carrinhoDeCompras.calcularValoTotal();

    }
}
