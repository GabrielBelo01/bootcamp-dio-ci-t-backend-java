# 💰 TributosProduto – Cálculo de Impostos por Categoria de Produto em Java

Projeto simples desenvolvido durante o **Bootcamp Backend com Java – DIO**, com foco na prática de **Programação Orientada a Objetos (POO)** em Java.

---

## 📌 Funcionalidades

- Definição de categorias de produtos: **Alimentação**, **Saúde e Bem-Estar**, **Vestuário** e **Cultura**  
- Cálculo do imposto de cada produto com **taxa específica** por categoria  
- Aplicação das regras de negócio de forma prática e orientada a objetos  

---

## 💡 Regras de Negócio

As taxas de imposto são aplicadas sobre o **valor do produto**, conforme a categoria:  

| Categoria           | Taxa de Imposto |
|--------------------|----------------|
| 🍎 Alimentação       | 1%             |
| 💊 Saúde e Bem-Estar | 1,5%           |
| 👗 Vestuário         | 2,5%           |
| 📚 Cultura           | 4%             |

---

## 🧱 Estrutura do Projeto

```text
domain/
 ├── ProdutosInterface.java
 ├── Produto.java
 ├── Alimentacao.java
 ├── SaudeBemEstar.java
 ├── Vestuario.java
 └── Cultura.java

🧠 Conceitos Aplicados

Interface e classe abstrata para definir contratos e comportamentos comuns

Encapsulamento de atributos para proteger dados internos

Sobrescrita de métodos para cálculo específico de impostos por categoria

▶️ Como Executar

1 Clone o repositório:
git clone <url-do-repositorio>


2 Abra o projeto em uma IDE Java de sua preferência

3 Crie instâncias de produtos e utilize o método calcularImposto() para verificar o imposto de cada categoria


✍️ Autor
Projeto desenvolvido como exercício de prática de Java e POO durante o Bootcamp Backend com Java – DIO.