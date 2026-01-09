# 🛒 Estoque de Produtos – Pesquisa Avançada com Collections Java (Map)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar conceitos de **pesquisa e agregação** dentro da interface **Map**, explorando como realizar cálculos estatísticos e buscas por critérios específicos (maior/menor valor) em uma estrutura de chave-valor.

---

## 📌 Funcionalidades

- Adicionar produtos ao estoque com código, nome, quantidade e preço
- Exibir a listagem completa de produtos e seus detalhes
- Calcular o valor total financeiro de todo o estoque armazenado
- Localizar o produto de maior valor unitário (mais caro)
- Localizar o produto de menor valor unitário (mais barato)
- Identificar o produto com maior valor total agregado (quantidade × preço)

---

## 💡 Regras de Negócio Implementadas

### Estoque de Produtos (Interface Map)
- Uso da implementação **HashMap** para associar um código único (`Long`) ao objeto `Produto`.
- Lógica de iteração sobre o `Map.values()` para realizar somatórios e comparações de preços.
- Métodos de busca que percorrem a coleção para encontrar extremos (Máximo e Mínimo) de forma eficiente.

### Produto
- Entidade com atributos `nome`, `preco` e `quantidade`.
- Encapsulamento de dados para garantir que os cálculos de estoque sejam baseados em informações íntegras.
- Sobrescrita do `toString()` para facilitar a auditoria visual do estoque.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Map)**
- **Pesquisa em Map** (Iteração e localização de objetos complexos)
- Algoritmos de redução (Soma total e busca de extremos)
- Manipulação de tipos numéricos (`double` e `long`) em coleções

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Map) da DIO**.

---

✅ **Projeto focado em lógica de negócios, cálculos financeiros e filtragem de dados em Maps.**
