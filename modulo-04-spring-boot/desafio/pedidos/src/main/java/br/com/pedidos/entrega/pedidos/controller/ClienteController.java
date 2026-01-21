package br.com.pedidos.entrega.pedidos.controller;

import br.com.pedidos.entrega.pedidos.dto.ClienteDTO;
import br.com.pedidos.entrega.pedidos.model.Cliente;
import br.com.pedidos.entrega.pedidos.service.ClienteService;
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
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente (@Valid @RequestBody ClienteDTO dto){
        Cliente cliente = clienteService.criarCliente(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarPorTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Long id,@Valid @RequestBody ClienteDTO dto){
        clienteService.atualizar(id,dto);
        return ResponseEntity.noContent().build();
    }




}
