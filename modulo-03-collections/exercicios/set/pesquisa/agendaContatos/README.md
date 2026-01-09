# 📖 Agenda de Contatos – Pesquisa com Collections Java (Set)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar conceitos de **pesquisa e atualização** dentro da interface **Set**, explorando como localizar e modificar objetos em uma coleção que preza pela unicidade dos elementos.

---

## 📌 Funcionalidades

- Adicionar contatos (nome e telefone) ao conjunto
- Exibir a lista completa de contatos cadastrados
- Pesquisar contatos por uma parte do nome ou nome completo
- Atualizar o número de telefone de um contato existente através do nome

---

## 💡 Regras de Negócio Implementadas

### Agenda de Contatos (Interface Set)
- Uso da implementação **HashSet** para armazenamento dos contatos.
- Lógica de pesquisa que percorre o conjunto e retorna um novo `Set` com todos os resultados que iniciam com o nome informado.
- Método de atualização que localiza o primeiro contato correspondente para modificar o atributo de telefone.

### Contato
- Entidade com atributos `nome` e `numero`.
- **Garantia de Unicidade:** Implementação de `equals()` e `hashCode()` baseada no nome, impedindo nomes duplicados na agenda.
- Sobrescrita do `toString()` para visualização clara no console.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Set)**
- **Pesquisa em Set** (Filtragem de elementos)
- Manipulação de objetos em memória
- Sobrescrita de métodos fundamentais (`equals/hashCode`)

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Set) da DIO**.

---

✅ **Projeto focado em algoritmos de busca e atualização em conjuntos de dados.**