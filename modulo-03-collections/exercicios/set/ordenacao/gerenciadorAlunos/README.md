# 🎓 Gerenciador de Alunos – Ordenação com Collections Java (Set)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é gerenciar uma lista de alunos garantindo que não existam matrículas duplicadas e oferecendo diferentes perspectivas de visualização através da ordenação por nome ou nota.

---

## 📌 Funcionalidades

- Adicionar alunos com nome, matrícula única e média (nota)
- Remover alunos do conjunto utilizando o número da matrícula
- Exibir alunos em ordem alfabética por nome
- Exibir alunos em ordem crescente de nota
- Exibir a lista completa sem critério específico de ordenação

---

## 💡 Regras de Negócio Implementadas

### Gerenciador de Alunos (Interface Set)
- Uso de **HashSet** para garantir que cada matrícula seja única no sistema.
- Conversão temporária ou uso de **TreeSet** para processar as ordenações solicitadas.
- Lógica de remoção baseada em comparação de tipos primitivos/wrappers (`long`).

### Aluno
- Atributos: `nome`, `matricula` e `nota`.
- **Regra de Unicidade:** Sobrescrita de `equals()` e `hashCode()` vinculada exclusivamente à `matricula`.
- Implementação de `Comparable` para ordenação por nome e criação de um `ComparatorNota` para a ordenação por desempenho acadêmico.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Set)**
- Ordenação de objetos complexos
- Diferença prática entre **HashSet** (performance) e **TreeSet** (ordem)
- Manipulação de tipos numéricos e Strings em coleções

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Set) da DIO**.

---

✅ **Projeto focado em gestão de dados acadêmicos e flexibilidade de ordenação em conjuntos.**