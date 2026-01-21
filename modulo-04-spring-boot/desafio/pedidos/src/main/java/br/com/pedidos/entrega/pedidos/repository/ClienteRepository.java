package br.com.pedidos.entrega.pedidos.repository;

import br.com.pedidos.entrega.pedidos.model.Cliente;
import br.com.pedidos.entrega.pedidos.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
