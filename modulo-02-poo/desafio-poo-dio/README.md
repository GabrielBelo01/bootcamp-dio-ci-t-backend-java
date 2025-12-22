# 🎓 Bootcamp DIO – Simulação de Plataforma de Aprendizado em Java

Projeto desenvolvido em **Java** com o objetivo de praticar **Programação Orientada a Objetos (POO)**, aplicando conceitos como **herança, polimorfismo, encapsulamento, abstração e uso de coleções**.

O sistema simula o funcionamento básico de um **bootcamp**, onde desenvolvedores se inscrevem, consomem conteúdos (cursos e mentorias) e acumulam experiência (**XP**).

---

## 📌 Funcionalidades

- Criar um bootcamp com nome, descrição e conteúdos
- Inscrever desenvolvedores em um bootcamp
- Associar conteúdos automaticamente ao desenvolvedor inscrito
- Progredir nos conteúdos do bootcamp
- Separar conteúdos inscritos e concluídos
- Calcular o XP total do desenvolvedor
- Trabalhar com diferentes tipos de conteúdo (**Curso** e **Mentoria**)

---

## 💡 Regras de Negócio Implementadas

### Bootcamp
- Data inicial automática (`LocalDate.now()`)
- Data final calculada (+45 dias)
- Lista de desenvolvedores inscritos
- Conjunto de conteúdos disponíveis

### Dev
- Ao se inscrever, recebe todos os conteúdos do bootcamp
- Pode progredir consumindo um conteúdo por vez
- Move conteúdos de **inscritos** para **concluídos**

### Cálculo de XP
- **Curso** → XP padrão × carga horária
- **Mentoria** → XP padrão + bônus fixo

Outros pontos:
- Evita duplicações usando `Set`
- A ordem de progressão é preservada com `LinkedHashSet`

---

## 🧱 Estrutura do Projeto

```
br.com.dio.desafio.dominio/
 ├── Bootcamp.java     # Entidade que representa o bootcamp
 ├── Conteudo.java     # Classe abstrata base para conteúdos
 ├── Curso.java        # Conteúdo do tipo curso
 ├── Mentoria.java     # Conteúdo do tipo mentoria
 └── Dev.java          # Desenvolvedor participante do bootcamp
```


---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Abstração com classes abstratas
- Herança (`extends`)
- Polimorfismo (`calcularXP`)
- Encapsulamento
- Uso de `Set`, `HashSet` e `LinkedHashSet`
- `Optional` para evitar `NullPointerException`
- Sobrescrita de `equals` e `hashCode`
- Datas com `java.time.LocalDate`

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)
3. Crie uma classe `Main` para instanciar:
    - Cursos
    - Mentorias
    - Bootcamp
    - Devs
4. Execute o projeto e observe a progressão e o cálculo de XP

---

## 🚀 Possíveis Evoluções

- Interface gráfica ou menu interativo
- Persistência de dados (arquivo ou banco)
- Ranking de desenvolvedores por XP
- Novos tipos de conteúdo
- Testes unitários com JUnit
- Relatórios de progresso

---

## ✍️ Autor

Projeto desenvolvido para fins de **estudo e prática de Java**, como parte dos desafios de **Programação Orientada a Objetos da DIO**.

---

✅ **Projeto focado em modelagem de domínio, clareza de regras e boas práticas de POO.**

