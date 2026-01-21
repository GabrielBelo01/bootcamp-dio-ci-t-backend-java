package br.com.pedidos.entrega.pedidos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ClienteDTO {


    @NotBlank(message = "nome é obrigatório")
    @Size(min = 2, max = 100, message = "nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @NotBlank(message = "cpf é obrigatório")
    @Pattern(
            regexp = "\\d{11}",
            message = "cpf deve conter 11 digitos numéricos"
    )
    private String cpf;

    @NotBlank(message = "cep é obrigatório")
    @Pattern(
            regexp = "\\d{8}",
            message = "cep deve conter 8 digitos numéricos"
    )
    private String cep;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
