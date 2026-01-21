package br.com.pedidos.entrega.pedidos.service;

import br.com.pedidos.entrega.pedidos.dto.ClienteDTO;
import br.com.pedidos.entrega.pedidos.model.Cliente;

public interface ClienteService {
    Cliente criarCliente(ClienteDTO dto);
    Iterable<Cliente> buscarPorTodos();
    Cliente buscarPorId(Long id);
    void atualizar(Long id, ClienteDTO dto);
}
