# 📦 Cadastro de Produtos – Ordenação com Collections Java (Set)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar conceitos de **ordenação em conjuntos**, explorando como a interface **Set** (através da implementação **TreeSet**) permite organizar elementos automaticamente por diferentes critérios.

---

## 📌 Funcionalidades

- Adicionar produtos com código único, nome, preço e quantidade
- Exibir todos os produtos organizados por **nome** (Ordem Alfabética)
- Exibir todos os produtos organizados por **preço** (Ordem Crescente)
- Garantir a unicidade dos produtos através do código identificador

---

## 💡 Regras de Negócio Implementadas

### Cadastro de Produtos (Interface Set)
- Uso da implementação **HashSet** para armazenamento inicial e **TreeSet** para as operações de exibição ordenada.
- O sistema utiliza o **TreeSet** com `Comparable` para a ordenação natural (por nome).
- Utilização de um **Comparator** personalizado para realizar a ordenação secundária por preço.

### Produto
- Entidade com atributos `nome`, `cod`, `preco` e `quantidade`.
- **Unicidade:** Implementação de `equals()` e `hashCode()` baseada no atributo `cod`, impedindo produtos com o mesmo código no conjunto.
- Implementação da interface `Comparable<Produto>` para definir a ordem alfabética como padrão.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Set)**
- Uso de **TreeSet** para ordenação automática
- Interfaces **Comparable** e **Comparator**
- Sobrescrita de métodos fundamentais para integridade de dados

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **