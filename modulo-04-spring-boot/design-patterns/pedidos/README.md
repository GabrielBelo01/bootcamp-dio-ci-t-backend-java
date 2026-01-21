# 📦 Pedidos API

API REST desenvolvida em **Spring Boot** para gerenciamento de **Clientes** e **Pedidos**, com validação de dados, tratamento padronizado de erros e testes automatizados de controller.

Projeto desenvolvido como parte de um **bootcamp**, com foco em boas práticas de arquitetura, REST e qualidade de código.

---

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3.5.9**
- **Spring Web**
- **Spring Data JPA**
- **Bean Validation** (`spring-boot-starter-validation`)
- **Spring Cloud OpenFeign** (Spring Cloud **2025.0.0**) — integração ViaCEP
- **MySQL** (Connector/J `mysql-connector-j`)
- **Springdoc OpenAPI 2.8.1** (Swagger UI)
- **JUnit 5 + MockMvc** (`spring-boot-starter-test`)

---

## 🧱 Arquitetura

O projeto segue separação clara de responsabilidades:

```text
controller  → camada REST
service     → regras de negócio
repository  → acesso a dados
model       → entidades JPA
dto         → entrada/saída da API
exception   → exceções e handlers globais
integration → serviços externos (ViaCEP)
enums       → enums do domínio (ex: StatusPedido)
```
## 📌 Funcionalidades

### Clientes
- Criar cliente
- Listar clientes
- Buscar cliente por ID
- Atualizar cliente
- Validação de dados (nome, CPF, CEP)
- Busca automática de endereço via **ViaCEP**

### Pedidos
- Criar pedido para um cliente
- Listar pedidos
- Buscar pedido por ID
- Atualizar pedido
- Remover pedido
- Buscar pedidos por status

---

## 🔁 Status do Pedido

O processo de entrega é representado pela evolução do **status do pedido**, utilizando `enum`:

- `PENDENTE`
- `PAGO`
- `ENVIADO`
- `ENTREGUE`
- `CANCELADO`

---

## 🌐 Endpoints principais

### Clientes

| Método | Endpoint | Descrição |
|------|---------|-----------|
| POST | `/clientes` | Criar cliente |
| GET | `/clientes` | Listar clientes |
| GET | `/clientes/{id}` | Buscar cliente por ID |
| PUT | `/clientes/{id}` | Atualizar cliente |

### Pedidos

| Método | Endpoint | Descrição |
|------|---------|-----------|
| POST | `/pedidos` | Criar pedido |
| GET | `/pedidos` | Listar pedidos |
| GET | `/pedidos/{id}` | Buscar pedido por ID |
| PUT | `/pedidos/{id}` | Atualizar pedido |
| DELETE | `/pedidos/{id}` | Remover pedido |
| GET | `/pedidos/status/{status}` | Buscar pedidos por status |

---

## 📘 Documentação (Swagger)

Com a aplicação rodando, acesse o Swagger UI:

/swagger-ui/index.html


---

## ⚠️ Tratamento de erros (padrão)

### Erro de validação — **400 BAD REQUEST**

```json
{
  "status": 400,
  "error": "BAD_REQUEST",
  "message": "Dados inválidos",
  "path": "/clientes",
  "fields": {
    "cpf": "cpf deve conter 11 dígitos numéricos",
    "nome": "nome deve ter entre 2 e 100 caracteres",
    "cep": "cep deve conter 8 dígitos numéricos"
  },
  "timestamp": "2026-01-21T14:48:12.4140721"
}
```

### Recurso não encontrado — **404 NOT FOUND**

```json
{
  "status": 404,
  "error": "NOT_FOUND",
  "message": "Cliente nao encontrado com id: 9999",
  "path": "/clientes/9999",
  "timestamp": "2026-01-21T15:00:10.123"
}
```

### Status de pedido inválido — 400 BAD REQUEST

```json
{
"status": 400,
"error": "BAD_REQUEST",
"message": "Status do pedido inválido: paocomagua",
"path": "/pedidos/status/paocomagua",
"validValues": [
"PENDENTE",
"PAGO",
"ENVIADO",
"ENTREGUE",
"CANCELADO"
],
"timestamp": "2026-01-21T15:42:15.5453602"
}
```

## 🧪 Testes

Foram implementados testes de controller utilizando **MockMvc**, validando:

- Retorno **400** para dados inválidos com `fields`
- Retorno **404** para recurso inexistente com JSON padronizado

Exemplo de teste:

- `ClienteControllerTest`

---

## ▶️ Como executar o projeto

### Pré-requisitos

- Java 17
- Maven
- MySQL em execução

### Executar

```bash
mvn spring-boot:run
```

## A aplicação estará disponível em:
http://localhost:8080


## 🏁 Observações finais

Este projeto foi desenvolvido com foco em:

- Boas práticas REST
- Código limpo e organizado
- Validação e tratamento adequado de erros
- Escopo controlado para entrega de módulo de bootcamp

