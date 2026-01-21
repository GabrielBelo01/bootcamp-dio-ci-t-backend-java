package br.com.pedidos.entrega.pedidos.exception;

public class PedidoNaoEncontradoException extends EntidadeNaoEncontradaException{
    public PedidoNaoEncontradoException(Long id){
        super("Pedido nao encontrado com id: " + id);
    }
}
