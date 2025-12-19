# 🎟️ Formatador de Números de Telefone

Projeto simples desenvolvido durante o Bootcamp Backend com Java – DIO, com foco na prática de **Programação Orientada a Objetos** e manipulação de strings.

---

## 📌 Objetivo

Receber números de telefone ou celular, identificar o tipo (fixo ou celular, com ou sem DDD) e retornar o número **formatado corretamente**.

---

## 🧩 Funcionalidades

- Formata números com base na quantidade de dígitos:
  - Telefone fixo sem DDD (8 dígitos → `xxxx-xxxx`)
  - Telefone fixo com DDD (10 dígitos → `(xx)xxxx-xxxx`)
  - Celular sem DDD (9 dígitos → `xxxxx-xxxx`)
  - Celular com DDD (11 dígitos → `(xx)xxxxx-xxxx`)
- Aceita entradas **com ou sem formatação**.
- Corrige máscaras incorretas e ignora caracteres extras.
- Retorna mensagem de erro se o número for inválido.

---

## 🧠 Conceitos Utilizados

- Métodos estáticos  
- Manipulação de strings (`StringBuilder`)  
- Regex para validar números  
- Estrutura condicional (`switch/case`)  

---

## ▶️ Execução

A classe principal (`application.Programa`) testa diferentes entradas e imprime o número formatado junto com o tipo (telefone fixo ou celular, com ou sem DDD).

---

## 🚀 Aprendizado

- Trabalhar com manipulação de strings e expressões regulares.  
- Criar métodos reutilizáveis e centralizar a lógica de formatação.  
- Entender a importância de limpar e validar entradas antes de processar.
