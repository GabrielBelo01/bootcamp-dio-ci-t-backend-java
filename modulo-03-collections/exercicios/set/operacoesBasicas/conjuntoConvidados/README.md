# 👥 Conjunto de Convidados – Operações Básicas com Collections Java (Set)

Este projeto integra o conjunto de exercícios práticos desenvolvidos durante o **Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar na prática os conceitos da interface **Set**, compreendendo como o Java lida com coleções que não permitem elementos duplicados, utilizando Programação Orientada a Objetos e boas práticas.

---

## 📌 Funcionalidades

- Adicionar convidados ao conjunto com nome e código de convite
- Remover um convidado específico através do seu código único
- Contar o número total de convidados presentes no conjunto
- Exibir a lista completa de convidados cadastrados

---

## 💡 Regras de Negócio Implementadas

### Conjunto de Convidados (Interface Set)
- Uso da implementação **HashSet** para garantir a unicidade dos elementos.
- Lógica de remoção baseada em um identificador único (código do convite).
- Utilização do método `size()` para retornar a contagem exata de elementos não repetidos.

### Convidado
- Entidade com atributos `nome` e `codigoConvite`.
- **Importante:** Sobrescrita dos métodos `equals()` e `hashCode()` para garantir que o Set identifique corretamente convidados com o mesmo código e impeça a duplicidade.
- Implementação do `toString()` para formatação dos dados na exibição.

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- **Java Collections Framework (Interface Set)**
- Manipulação de **HashSet**
- Sobrescrita de `equals` e `hashCode` (Garantia de unicidade)
- Iteração e gerenciamento de conjuntos

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Collections (Set) da DIO**.

---

✅ **Projeto focado em unicidade de dados e operações fundamentais com a interface Set.**