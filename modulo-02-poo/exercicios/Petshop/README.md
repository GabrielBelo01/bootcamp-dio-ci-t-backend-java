# 🐶 Projeto Petshop – Máquina de Banho

Projeto desenvolvido como parte dos **desafios do Bootcamp da DIO**, com foco em **Java**, **POO**, **boas práticas de modelagem** e **regras de negócio**.

---

## 📌 Descrição

O sistema simula o controle de uma **máquina de banho para pets**, respeitando regras reais de funcionamento, consumo de recursos e estados da máquina.

O usuário interage via **menu em console**, podendo executar ações como dar banho, abastecer água/shampoo, verificar níveis e consultar histórico de banhos.

---

## ⚙️ Funcionalidades

* Dar banho no pet
* Finalizar banho
* Abastecer água (2 litros por vez)
* Abastecer shampoo (2 litros por vez)
* Verificar nível de água
* Verificar nível de shampoo
* Verificar se há pet em banho
* Colocar pet na máquina
* Retirar pet da máquina sem banho
* Limpar a máquina
* Registrar histórico de banhos

---

## 🧠 Regras de Negócio

* Apenas **1 pet por vez** na máquina
* Cada banho consome:

  * 10 litros de água
  * 2 litros de shampoo
* Capacidade máxima da máquina:

  * 30 litros de água
  * 10 litros de shampoo
* Limpeza da máquina consome:

  * 3 litros de água
  * 1 litro de shampoo
* Se o pet for retirado sem banho, a máquina fica **suja**
* A máquina só pode ser usada se estiver **livre**

---

## 🏗️ Estrutura do Projeto

```
application
 └── Programa.java        # Menu e interação com o usuário

domain
 ├── Petshop.java         # Orquestra as ações
 ├── MaquinaLavar.java    # Regras e estados da máquina
 ├── Banhos.java          # Registro de histórico de banhos

enums
 └── EstadoMaquina.java   # LIVRE, COM_PET, EM_BANHO, SUJA
```

---

## 🧩 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Enum para controle de estado
* Separação de responsabilidades
* Lista para histórico de eventos
* ID incremental com atributo `static`

---

## ▶️ Execução

1. Compile o projeto
2. Execute a classe `Programa`
3. Interaja com o menu via terminal

---

## 🚀 Objetivo Educacional

Este projeto tem como objetivo **fixar conceitos fundamentais de Java**, especialmente:

* Modelagem correta de domínio
* Uso de enums para estados
* Regras de negócio claras
* Código limpo e legível

---

📚 Projeto desenvolvido durante o **Bootcamp Java Backend da DIO**.
