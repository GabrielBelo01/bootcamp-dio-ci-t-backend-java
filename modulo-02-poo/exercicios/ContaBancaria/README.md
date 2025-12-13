# 🐷 Pig Bank – Simulação de Conta Bancária em Java

Projeto desenvolvido em **Java** com o objetivo de praticar **Programação Orientada a Objetos**, encapsulamento e modelagem de **regras de negócio reais de uma conta bancária**.

---

## 📌 Funcionalidades

* Consultar saldo da conta
* Consultar limite do cheque especial
* Consultar saldo total disponível (saldo + cheque especial)
* Realizar depósitos
* Realizar saques
* Pagar boletos
* Utilizar cheque especial automaticamente quando o saldo não for suficiente
* Cobrança automática de **taxa de 20%** sobre o valor utilizado do cheque especial

---

## 💡 Regras de Negócio Implementadas

* O **saldo disponível** é a soma do saldo da conta com o limite do cheque especial
* O limite do cheque especial é definido no momento da criação da conta:

  * Saldo inicial até R$ 500,00 → cheque especial de R$ 50,00
  * Saldo inicial acima de R$ 500,00 → cheque especial equivalente a 50% do saldo
* Caso o saldo não seja suficiente para uma operação, o sistema utiliza automaticamente o cheque especial
* Ao usar o cheque especial, é registrada a quantia utilizada
* Assim que ocorrer um depósito, o sistema cobra automaticamente **20% de taxa** sobre o valor utilizado do cheque especial
* Valores inválidos (zero ou negativos) são rejeitados

---

## 🧱 Estrutura do Projeto

```
application/
 └── Programa.java   # Interface de interação com o usuário (menu)

entity/
 └── Banco.java      # Regras de negócio da conta bancária
```

---

## 🧠 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Métodos privados para regras internas
* Separação de responsabilidades (Application x Entity)
* Evitar estados duplicados
* Cálculo de valores derivados sob demanda
* Reutilização de lógica

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Programa`
4. Interaja com o menu pelo terminal

---

## 🚀 Possíveis Evoluções

* Histórico de transações
* Interface `Conta`
* Implementação de `ContaCorrente`
* Testes unitários
* Persistência de dados

---

## ✍️ Autor

Projeto desenvolvido para fins de estudo e prática de Java e lógica de negócios bancários.

---

✅ **Projeto focado em clareza, regras reais e boas práticas de orientação a objetos.**
