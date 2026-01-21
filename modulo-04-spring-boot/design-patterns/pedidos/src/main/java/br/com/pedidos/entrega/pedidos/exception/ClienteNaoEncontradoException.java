package br.com.pedidos.entrega.pedidos.exception;

public class ClienteNaoEncontradoException extends EntidadeNaoEncontradaException{
    public  ClienteNaoEncontradoException(Long id){
        super("Cliente nao encontrado com id: " + id);
    }
}
