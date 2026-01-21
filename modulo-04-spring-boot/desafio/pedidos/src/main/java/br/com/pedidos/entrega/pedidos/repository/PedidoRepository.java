package br.com.pedidos.entrega.pedidos.repository;

import br.com.pedidos.entrega.pedidos.enums.StatusPedido;
import br.com.pedidos.entrega.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatus(StatusPedido status);
}
