package list.operacoesBasicas.carrinho.domain;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinhoCompras = new ArrayList<>();

    public CarrinhoDeCompras() {}

    public void adiconarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item item : carrinhoCompras){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    public void calcularValoTotal(){
        double valorTotal = 0;

        for(Item item : carrinhoCompras){
           valorTotal += item.getPreco() * item.getQuantidade();
        }

        System.out.println("Valor total do list.operacoesBasicas.carrinho é de: "+valorTotal);
    }

    public void exibisItens(){
        System.out.println(carrinhoCompras);
    }
}
