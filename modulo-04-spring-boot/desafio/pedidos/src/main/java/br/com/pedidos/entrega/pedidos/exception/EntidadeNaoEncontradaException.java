package br.com.pedidos.entrega.pedidos.exception;

public abstract class EntidadeNaoEncontradaException extends RuntimeException{

    protected EntidadeNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
