# 📚 Livraria Online – Ordenação e Pesquisa com Collections Java (Map)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é gerenciar um catálogo de livros complexo, utilizando a interface **Map** para associar links de marketplace a objetos de livros e aplicando filtros de **ordenação por valores** (preço) e pesquisa por atributos (autor).

---

## 📌 Funcionalidades

- Adicionar livros utilizando o link da Amazon como chave única
- Remover livros do catálogo baseados no título
- Exibir o acervo completo ordenado por **preço** (Ordem Crescente)
- Pesquisar todos os livros de um determinado autor
- Identificar o livro mais caro e o mais barato disponível na livraria

---

## 💡 Regras de Negócio Implementadas

### Livraria Online (Interface Map)
- Uso de **HashMap** para armazenamento principal e alta performance em buscas por chave (link).
- Lógica de ordenação por preço: como o Map não ordena nativamente por valores, utiliza-se a criação de uma `List` a partir das entradas do mapa para aplicar o `Comparator`.
- Filtragem por autor que percorre a coleção e retorna um novo conjunto de resultados correspondentes.

### Livro
- Atributos: `titulo`, `autor` e `preco`.
- Implementação de lógica comparativa para determinar extremos de valor (Caro vs Barato).
- Encapsulamento para proteção dos dados sensíveis como o preço unitário.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Map)**
- **Ordenação por Valores** em Maps (Uso de `List` e `Comparator`)
- Filtragem de dados com base em múltiplos critérios
- Manipulação de tipos decimais (`double`) e Strings

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Map) da DIO**.

---

✅ **Projeto focado em manipulação avançada de coleções, comparadores personalizados e lógica de marketplace.**