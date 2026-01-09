# 📅 Agenda de Eventos – Ordenação com Collections Java (Map)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar conceitos de **ordenação automática por chaves** utilizando a interface **Map**, explorando como a implementação **TreeMap** organiza cronologicamente eventos baseados em datas.

---

## 📌 Funcionalidades

- Adicionar eventos com data (`LocalDate`), nome do evento e atração
- Exibir a agenda completa em **ordem crescente de data**
- Consultar o **próximo evento** (o evento mais próximo da data atual)
- Gerenciar o fluxo de compromissos de forma organizada e automática

---

## 💡 Regras de Negócio Implementadas

### Agenda de Eventos (Interface Map)
- Uso da implementação **TreeMap** para garantir que todos os itens inseridos sejam automaticamente ordenados pela chave (`LocalDate`).
- Lógica de exibição que percorre o mapa já ordenado, facilitando a leitura cronológica.
- Método para obter o próximo evento utilizando funções de navegação do `TreeMap` e comparação com a data atual (`LocalDate.now()`).

### Evento
- Entidade com atributos `nome` e `atracao`.
- Encapsulamento de dados para representar as informações de cada atração.
- Sobrescrita do `toString()` para uma visualização clara dos detalhes do evento e sua respectiva data.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Map)**
- **Ordenação em Map** (Uso de **TreeMap** para ordenação de chaves)
- Manipulação de datas com a API `java.time.LocalDate`
- Métodos de navegação em mapas ordenados

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Map) da DIO**.

---

✅ **Projeto focado em cronogramas, ordenação por datas e manipulação de mapas ordenados.**