package br.com.pedidos.entrega.pedidos.service;

import br.com.pedidos.entrega.pedidos.dto.PedidoDTO;
import br.com.pedidos.entrega.pedidos.model.Pedido;

import java.util.List;

public interface PedidoService {

    Pedido criarPedido(PedidoDTO dto);
    Iterable<Pedido> buscarTodos();
    Pedido buscarPorId(Long id);
    void atualizar(Long id, PedidoDTO dto);
    void deletar(Long id);
    List<Pedido> buscarPorStatus(String status);

}
