package br.com.pedidos.entrega.pedidos.service.impl;

import br.com.pedidos.entrega.pedidos.dto.PedidoDTO;
import br.com.pedidos.entrega.pedidos.enums.StatusPedido;
import br.com.pedidos.entrega.pedidos.exception.ClienteNaoEncontradoException;
import br.com.pedidos.entrega.pedidos.exception.PedidoNaoEncontradoException;
import br.com.pedidos.entrega.pedidos.exception.StatusPedidoInvalidoException;
import br.com.pedidos.entrega.pedidos.model.Cliente;
import br.com.pedidos.entrega.pedidos.model.Pedido;
import br.com.pedidos.entrega.pedidos.repository.ClienteRepository;
import br.com.pedidos.entrega.pedidos.repository.PedidoRepository;
import br.com.pedidos.entrega.pedidos.service.PedidoService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository, ClienteRepository clienteRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Pedido criarPedido(PedidoDTO dto) {
        Cliente cliente = clienteRepository.findById(dto.getClienteId())
                .orElseThrow(() -> new ClienteNaoEncontradoException(dto.getClienteId()));

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setDescricao(dto.getDescricao());
        pedido.setValor(dto.getValor());
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setStatus(StatusPedido.PEDENTE);

        return pedidoRepository.save(pedido);
    }

    @Override
    public Iterable<Pedido> buscarTodos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElseThrow(() -> new PedidoNaoEncontradoException(id));
    }

    @Override
    public void atualizar(Long id, PedidoDTO dto) {
        Pedido novoPedido = buscarPorId(id);

        novoPedido.setId(id);
        novoPedido.setDescricao(dto.getDescricao());
        novoPedido.setValor(dto.getValor());

        pedidoRepository.save(novoPedido);
    }

    @Override
    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public List<Pedido> buscarPorStatus(String status) {
        try{
            StatusPedido statusPedido = StatusPedido.valueOf(status.toUpperCase());
            return pedidoRepository.findByStatus(statusPedido);
        }
        catch (IllegalArgumentException ex){
            throw new StatusPedidoInvalidoException(status);
        }
    }
}
