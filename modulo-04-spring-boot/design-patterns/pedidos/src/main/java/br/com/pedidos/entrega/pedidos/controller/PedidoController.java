package br.com.pedidos.entrega.pedidos.controller;

import br.com.pedidos.entrega.pedidos.dto.PedidoDTO;
import br.com.pedidos.entrega.pedidos.model.Pedido;
import br.com.pedidos.entrega.pedidos.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<Pedido> criarPedido (@Valid @RequestBody PedidoDTO dto){
        Pedido pedido = pedidoService.criarPedido(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }

    @GetMapping
    public ResponseEntity<Iterable<Pedido>> buscarTodos(){
        return ResponseEntity.ok(pedidoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(pedidoService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Long id,@Valid @RequestBody PedidoDTO dto){
        pedidoService.atualizar(id,dto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        pedidoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Pedido>> buscarPorStatus(@PathVariable String status){
        return ResponseEntity.ok(pedidoService.buscarPorStatus(status));
    }



}
