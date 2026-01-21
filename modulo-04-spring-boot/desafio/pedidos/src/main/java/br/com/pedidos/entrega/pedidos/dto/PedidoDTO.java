package br.com.pedidos.entrega.pedidos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class PedidoDTO {

    @NotNull(message = "clienteID é obrigatório")
    private Long clienteId;

    @NotBlank(message = "descricao é obrigatória")
    private String descricao;

    @NotNull(message = "valor é obrigatório")
    @Positive(message = "valor deve ser maior que zero")
    private Double valor;

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
