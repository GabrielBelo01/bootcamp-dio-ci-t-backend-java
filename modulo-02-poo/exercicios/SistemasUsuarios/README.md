# 👥 Sistema de Usuários

Projeto simples desenvolvido durante o **Bootcamp Backend com Java – DIO**, com foco na prática de **Programação Orientada a Objetos em Java**.

## 📌 Objetivo
Criar uma hierarquia de classes para representar diferentes tipos de usuários de um sistema, reutilizando comportamentos comuns e aplicando regras específicas para cada perfil.

## 🧩 Tipos de Usuário
- **Usuário (abstract)**  
  Classe base com dados comuns e comportamentos compartilhados, como login, logoff, alteração de dados e senha.

- **Gerente**  
  Responsável por consultar vendas, consultar caixa e gerar relatório financeiro.

- **Vendedor**  
  Realiza vendas e mantém o controle da quantidade de vendas realizadas.

- **Atendente**  
  Recebe pagamentos, controla o valor em caixa e realiza o fechamento do caixa.

## ⚙️ Funcionalidades
- Login e logoff
- Alteração de dados e senha
- Registro e consulta de vendas
- Controle e fechamento de caixa
- Geração de relatório financeiro

## 🧠 Conceitos Utilizados
- Herança
- Abstração
- Encapsulamento
- Polimorfismo
- Regras de negócio centralizadas

## ▶️ Execução
A classe `Application` instancia os usuários e demonstra o funcionamento das operações diretamente no console.

## 🚀 Aprendizado
Projeto voltado para reforçar o uso correto de herança, reaproveitamento de código e organização de responsabilidades em sistemas orientados a objetos.
