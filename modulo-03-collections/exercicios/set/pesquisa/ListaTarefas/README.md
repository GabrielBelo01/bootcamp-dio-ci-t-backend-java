# 📋 Lista de Tarefas – Pesquisa e Gerenciamento com Collections Java (Set)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é criar um sistema de gerenciamento de tarefas utilizando a interface **Set**, focando na filtragem de estados (concluído/pendente) e manipulação de atributos booleanos em coleções.

---

## 📌 Funcionalidades

- Adicionar e remover tarefas do conjunto
- Exibir todas as tarefas e contar o total de itens
- Filtrar tarefas por status (Concluídas ou Pendentes)
- Marcar tarefas individualmente como concluídas ou pendentes
- Limpar toda a lista de tarefas de uma vez

---

## 💡 Regras de Negócio Implementadas

### Lista de Tarefas (Interface Set)
- Uso de **HashSet** para gerenciar a coleção de tarefas.
- Lógica de filtragem que utiliza a iteração para separar objetos com base no atributo `concluido`.
- Métodos de busca por descrição para localizar e alterar o estado booleano de cada tarefa.
- Operação de remoção em lote através do método `clear()`.

### Tarefa
- Atributos: `descricao` (String) e `concluido` (boolean).
- Implementação de `equals()` e `hashCode()` para evitar tarefas com descrições idênticas.
- Encapsulamento para alteração segura do status da tarefa.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Set)**
- **Pesquisa em Set** (Filtragem por atributos específicos)
- Lógica de estados booleanos
- Gerenciamento de coleções dinâmicas

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Set) da DIO**.

---

✅ **Projeto focado em manipulação de estados de objetos e filtragem avançada em Sets.**