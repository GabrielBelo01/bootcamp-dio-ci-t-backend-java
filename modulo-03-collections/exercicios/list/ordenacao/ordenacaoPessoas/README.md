# 🧍 Ordenação de Pessoas – Ordenação com Collections Java (List)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar na prática os conceitos treinados no bootcamp, com foco em algoritmos de **ordenação de objetos** utilizando as interfaces **Comparable** e **Comparator** dentro da interface **List**.

---

## 📌 Funcionalidades

- Adicionar pessoas à lista com nome, idade e altura
- Ordenar a lista de pessoas por **idade** (Ordem Natural)
- Ordenar a lista de pessoas por **altura** (Ordem Personalizada)
- Exibir a listagem de pessoas conforme o critério de ordenação escolhido

---

## 💡 Regras de Negócio Implementadas

### Ordenação de Pessoas (Interface List)
- Uso da implementação **ArrayList** para gerenciar o grupo de pessoas.
- Implementação do método `ordenarPorIdade()` utilizando a interface `Comparable` na classe Pessoa.
- Implementação do método `ordenarPorAltura()` utilizando um `Comparator` personalizado.

### Pessoa
- Entidade com atributos `nome`, `idade` e `altura`.
- Implementação da interface `Comparable<Pessoa>` para definir a ordenação padrão por idade.
- Classe interna ou lógica separada de `Comparator` para permitir a ordenação flexível por altura.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface List)**
- **Ordenação em List** (Comparable vs Comparator)
- Algoritmos de ordenação da classe `Collections.sort()`
- Manipulação de tipos genéricos (`Generics`)

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (List) da DIO**.

---

✅ **Projeto focado em ordenação de objetos e uso de interfaces comparativas em Java.**