# 📬 Sistema de Envio de Mensagens

Projeto simples desenvolvido durante o Bootcamp Backend com Java – DIO, com foco na prática de **Programação Orientada a Objetos**, interfaces e polimorfismo.

---

## 📌 Objetivo

Criar uma hierarquia de classes para representar diferentes serviços de envio de mensagens (SMS, Email, Redes Sociais, WhatsApp) e enviar uma mesma mensagem para todos os serviços disponíveis.

---

## 🧩 Funcionalidades

- Envia mensagens através de múltiplos canais:
    - SMS
    - Email
    - Redes Sociais
    - WhatsApp
- Permite adicionar novos serviços facilmente implementando a interface `ServicoMensagem`.
- Demonstra uso de **polimorfismo**, **interfaces** e **reutilização de código**.

---

## 🧠 Conceitos Utilizados

- Interface (`ServicoMensagem`)
- Polimorfismo e herança
- Estrutura de laço (`for-each`)
- Encapsulamento e implementação de métodos

---

## ▶️ Execução

A classe principal (`Programa`) define uma mensagem e envia para todos os serviços instanciados, imprimindo no console a saída de cada serviço.

---

## 🚀 Aprendizado

- Criar uma arquitetura flexível para múltiplos serviços.
- Entender e aplicar o conceito de **interfaces** em Java.
- Trabalhar com polimorfismo para chamar métodos de forma genérica.
