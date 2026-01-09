# 📊 Contagem de Palavras – Pesquisa com Collections Java (Map)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é exercitar a manipulação de frequências de dados utilizando a interface **Map**, simulando o comportamento de um analisador de texto para identificar recorrências de termos.

---

## 📌 Funcionalidades

- Adicionar palavras e suas respectivas frequências ao mapa
- Remover termos específicos da contagem
- Exibir todas as palavras rastreadas e suas quantidades
- Encontrar e retornar a palavra com a maior frequência de aparição

---

## 💡 Regras de Negócio Implementadas

### Contagem de Palavras (Interface Map)
- Uso de **HashMap** onde a chave é a `palavra` (String) e o valor é a `contagem` (Integer).
- Lógica de atualização: ao adicionar uma palavra já existente, o sistema pode incrementar ou substituir o valor associado.
- Algoritmo de pesquisa para encontrar a entrada (`Entry`) com o maior valor numérico na coleção.

### Eficiência de Busca
- Aproveitamento da estrutura de tabela hash para garantir que a verificação de existência e remoção de palavras ocorra em tempo constante.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Map)**
- **Pesquisa em Map** (Busca de maior valor associado)
- Manipulação de tipos Wrapper (`Integer`)
- Uso do `EntrySet` para percorrer chaves e valores simultaneamente

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Map) da DIO**.

---

✅ **Projeto focado em análise de frequência de dados e algoritmos de busca por valor.**