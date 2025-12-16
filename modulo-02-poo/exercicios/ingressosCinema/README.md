# 🎟️ Sistema de Ingressos de Cinema

Projeto simples desenvolvido durante o **Bootcamp Backend com Java – DIO**, com foco na prática de **Programação Orientada a Objetos em Java**.

## 📌 Objetivo
Criar uma hierarquia de classes para representar os tipos de ingressos comercializados em um cinema, aplicando regras específicas para o cálculo do valor final.

## 🧩 Tipos de Ingresso
- **Ingresso (abstract)**  
  Possui valor base, nome do filme e tipo de áudio (*DUBLADO* ou *LEGENDADO*), além do método `calculoValorIngresso()`.

- **Meia Entrada**  
  Retorna metade do valor do ingresso.

- **Ingresso Família**  
  Multiplica o valor pelo número de pessoas e aplica **5% de desconto** quando a quantidade for maior que 3.

## 🧠 Conceitos Utilizados
- Herança
- Abstração
- Polimorfismo
- Encapsulamento
- Enum (`Audio`)

## ▶️ Execução
A classe `Application` instancia os ingressos e imprime no console o valor final calculado conforme o tipo.

## 🚀 Aprendizado
Projeto voltado para reforçar boas práticas de POO, uso de enums para valores fixos e centralização de regras de negócio.
