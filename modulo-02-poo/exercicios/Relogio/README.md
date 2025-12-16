# ⏰ Sistema de Relógios

Projeto simples desenvolvido durante o **Bootcamp Backend com Java – DIO**, com foco na prática de **Programação Orientada a Objetos em Java**.

## 📌 Objetivo
Criar uma hierarquia de classes para representar relógios de diferentes países, aplicando regras específicas de funcionamento para cada formato de horário.

## 🧩 Tipos de Relógio
- **Relógio (abstract)**  
  Classe base com hora, minuto e segundo, além do método para exibição do horário no formato `HH:MM:SS`.

- **Relógio Brasileiro**  
  Utiliza o formato de **24 horas**.

- **Relógio Americano**  
  Utiliza o formato de **12 horas**, não permitindo horas de 13 a 24.

## ⚙️ Funcionalidades
- Validação de hora, minuto e segundo
- Formatação de horário (`HH:MM:SS`)
- Ajuste de horário entre relógios usando polimorfismo

## 🧠 Conceitos Utilizados
- Herança
- Abstração
- Polimorfismo
- Encapsulamento

## ▶️ Execução
A classe `Application` demonstra a criação dos relógios e a conversão de horário entre os formatos.

## 🚀 Aprendizado
Projeto voltado para reforçar o uso de herança e polimorfismo para tratar regras diferentes a partir de uma mesma abstração.
