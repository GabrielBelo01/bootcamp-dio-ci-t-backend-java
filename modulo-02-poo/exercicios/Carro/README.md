# 🚗 Simulador de Carro 

Este projeto faz parte dos **projetos desenvolvidos durante o Bootcamp de Backend com Java**, realizado na plataforma **DIO**.

O objetivo é aplicar na prática os conceitos estudados no bootcamp, como **Programação Orientada a Objetos**, **enum**, **regras de negócio** e **boas práticas de organização de código**.

---

## 📌 Objetivo do Projeto

Simular o comportamento básico de um carro, garantindo que:

* As ações respeitem o estado do carro (ligado/desligado)
* As marchas limitem corretamente a velocidade
* As regras sejam centralizadas e fáceis de manter

---

## ⚙️ Funcionalidades

* Ligar e desligar o carro
* Acelerar e diminuir a velocidade
* Passar e reduzir marchas (sem pular marchas)
* Virar para esquerda ou direita
* Menu interativo no terminal

---

## 📋 Regras Implementadas

* O carro inicia:

  * Desligado
  * Em ponto morto (marcha 0)
  * Velocidade 0 km/h

* O carro desligado **não executa nenhuma ação**

* Velocidade:

  * Aumenta de 1 em 1 km/h ao acelerar
  * Diminui de 1 em 1 km/h ao reduzir
  * Mínimo: 0 km/h
  * Máximo: 120 km/h

* Marchas:

| Marcha      | Velocidade Permitida |
| ----------- | -------------------- |
| Ponto Morto | Não acelera          |
| 1ª          | 0 a 20 km/h          |
| 2ª          | 21 a 40 km/h         |
| 3ª          | 41 a 60 km/h         |
| 4ª          | 61 a 80 km/h         |
| 5ª          | 81 a 100 km/h        |
| 6ª          | 101 a 120 km/h       |

* Não é permitido pular marchas

* O carro só pode ser desligado se:

  * Estiver em ponto morto
  * Velocidade igual a 0 km/h

* O carro só pode virar se a velocidade estiver entre:

  * 1 km/h e 40 km/h

---

## 🧠 Conceitos Utilizados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Enumeração (`enum`)
* Validação de regras de negócio
* Separação de responsabilidades

---

## 🗂️ Estrutura do Projeto

```
application
 └── Programa.java        # Menu e interação com o usuário

domain.entity
 └── Carro.java           # Regras e comportamento do carro

domain.enums
 ├── Marcha.java          # Regras de velocidade por marcha
 └── Direcao.java         # Direções possíveis (ESQUERDA/DIREITA)
```

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code)
3. Execute a classe:

```java
application.Programa
```

4. Utilize o menu no terminal para interagir com o carro

---

## 📌 Exemplo de Uso

```
==== Funções do carro ====
Ligar [1]
Desligar [2]
Passar Marcha [3]
Diminuir Marcha [4]
Acelerar [5]
Diminuir [6]
Virar Direita [7]
Virar Esquerda [8]
Sair [9]
```

---

## 🚀 Aprendizados

Este projeto reforça a importância de:

* Usar `enum` para representar estados finitos
* Centralizar regras no lugar correto
* Evitar lógica complexa espalhada pelo código
* Escrever código legível e de fácil manutenção

---

## 👤 Autor

Projeto desenvolvido para fins de estudo e prática em Java.

---

✅ **Código simples, regras claras e design orientado a objetos.**
