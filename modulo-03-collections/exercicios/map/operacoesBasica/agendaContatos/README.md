# 📱 Agenda de Contatos – Operações Básicas com Collections Java (Map)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar os conceitos da interface **Map**, compreendendo a estrutura de chave-valor para armazenamento de dados, onde cada chave é única e mapeia para um valor específico.

---

## 📌 Funcionalidades

- Adicionar contatos associando um nome (chave) a um número de telefone (valor)
- Remover contatos da agenda utilizando o nome como critério de busca
- Exibir a lista completa de todos os contatos (nome e telefone)
- Pesquisar o número de telefone de um contato através do seu nome

---

## 💡 Regras de Negócio Implementadas

### Agenda de Contatos (Interface Map)
- Uso da implementação **HashMap** para garantir alta performance em inserções e buscas.
- A chave do mapa é o `nome` (String), garantindo que não existam nomes duplicados com números diferentes.
- Caso um contato com o mesmo nome seja adicionado, o Map sobrescreve o valor anterior com o novo número de telefone.

### Fluxo de Dados
- O método de pesquisa utiliza a chave para retornar diretamente o valor correspondente, demonstrando a eficiência do Map em relação a listas.
- A exibição dos contatos percorre o conjunto de entradas do mapa para formatar a saída no console.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Map)**
- Manipulação de **HashMap** (Chave e Valor)
- Métodos `put`, `remove`, `get` e `containsKey`
- Tipos Genéricos (`Generics`) para segurança de tipos

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Map) da DIO**.

---

✅ **Projeto focado na estrutura chave-valor e na eficiência de busca por identificadores únicos.**