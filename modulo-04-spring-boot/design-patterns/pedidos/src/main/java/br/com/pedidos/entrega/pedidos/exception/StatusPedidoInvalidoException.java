package br.com.pedidos.entrega.pedidos.exception;

public class StatusPedidoInvalidoException extends RuntimeException {
    public StatusPedidoInvalidoException(String status) {
        super("Status do pedido inválido: " + status + ". Use: PENDENTE, PAGO, ENVIADO, ENTREGUE, CANCELADO");
    }
}
