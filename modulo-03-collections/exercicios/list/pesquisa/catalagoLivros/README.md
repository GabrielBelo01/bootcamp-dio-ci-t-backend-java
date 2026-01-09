# 📚 Catálogo de Livros – Pesquisa com Collections Java (List)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar na prática os conceitos treinados no bootcamp, com foco em algoritmos de **pesquisa e filtragem** utilizando a interface **List**, Programação Orientada a Objetos e boas práticas.

---

## 📌 Funcionalidades

- Adicionar novos livros ao catálogo com título, autor e ano
- Pesquisar livros por um autor específico e retornar uma lista de obras
- Pesquisar livros publicados em um intervalo de anos determinado
- Pesquisar livros pelo título e retornar o primeiro resultado encontrado

---

## 💡 Regras de Negócio Implementadas

### Catálogo de Livros (Interface List)
- Uso da implementação **ArrayList** para gerenciar o acervo de livros.
- Lógica de filtragem por autor que retorna uma sub-lista com todos os livros correspondentes.
- Pesquisa por intervalo de anos utilizando comparadores lógicos para selecionar obras entre duas datas.
- Busca por título que interrompe a execução ao encontrar a primeira ocorrência (First Match).

### Livro
- Representação da entidade com atributos `titulo`, `autor` e `anoPublicacao`.
- Encapsulamento completo para garantir a integridade dos dados.
- Implementação do método `toString()` para facilitar a visualização dos resultados da busca.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface List)**
- Algoritmos de busca e iteração (Loops e Condicionais)
- Manipulação de tipos genéricos (`Generics`)
- Filtragem de dados com base em múltiplos critérios

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (List) da DIO**.

---

✅ **Projeto focado em algoritmos de busca, filtragem de coleções e manipulação de objetos.**