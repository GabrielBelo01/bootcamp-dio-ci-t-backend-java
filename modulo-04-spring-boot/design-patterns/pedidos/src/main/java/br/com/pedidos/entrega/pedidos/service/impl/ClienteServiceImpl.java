package br.com.pedidos.entrega.pedidos.service.impl;

import br.com.pedidos.entrega.pedidos.dto.ClienteDTO;
import br.com.pedidos.entrega.pedidos.exception.ClienteNaoEncontradoException;
import br.com.pedidos.entrega.pedidos.integration.ViaCepService;
import br.com.pedidos.entrega.pedidos.model.Cliente;
import br.com.pedidos.entrega.pedidos.model.Endereco;
import br.com.pedidos.entrega.pedidos.repository.ClienteRepository;
import br.com.pedidos.entrega.pedidos.repository.EnderecoRepository;
import br.com.pedidos.entrega.pedidos.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;
    private final ViaCepService viaCepService;

    public ClienteServiceImpl(ClienteRepository clienteRepository, EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }


    @Override
    public Cliente criarCliente(ClienteDTO dto) {
        Cliente cliente = criarClienteComEndereco(dto);

        return clienteRepository.save(cliente);
    }


    @Override
    public Iterable<Cliente> buscarPorTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new ClienteNaoEncontradoException(id));
    }

    @Override
    public void atualizar(Long id, ClienteDTO dto) {
        if(!clienteRepository.existsById(id)) throw new ClienteNaoEncontradoException(id);

        Cliente cliente = criarClienteComEndereco(dto);
        cliente.setId(id);

        clienteRepository.save(cliente);

    }

    private Cliente criarClienteComEndereco(ClienteDTO dto) {
        String cep = dto.getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            return enderecoRepository.save(novoEndereco);
        });

        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setCpf(dto.getCpf());
        cliente.setEndereco(endereco);
        return cliente;
    }


}