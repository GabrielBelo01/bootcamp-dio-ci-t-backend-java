package br.com.pedidos.entrega.pedidos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveRetornar400QuandoCriarClienteInvalido() throws Exception{

        String json = """
            {
              "nome": "",
              "cpf": "123",
              "cep": ""
            }
        """;

        mockMvc.perform(post("/clientes")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.error").value("BAD_REQUEST"))
                .andExpect(jsonPath("$.path").value("/clientes"))
                .andExpect(jsonPath("$.fields.nome").exists())
                .andExpect(jsonPath("$.fields.cpf").exists())
                .andExpect(jsonPath("$.fields.cep").exists());
    }

    @Test
    void deveRetornar404QuandoClienteNaoExistir() throws Exception{
        mockMvc.perform(get("/clientes/9999"))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.error").value("NOT_FOUND"))
                .andExpect(jsonPath("$.path").value("/clientes/9999"))
                .andExpect(jsonPath("$.message").value("Cliente nao encontrado com id: 9999"));
    }
}
