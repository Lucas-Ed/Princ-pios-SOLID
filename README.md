# 🧩 Seminário — Princípios SOLID: SRP e LSP

Este repositório reúne dois projetos desenvolvidos como parte da disciplina **Técnicas de programação II**, do curso <a href="https://fatecararas.cps.sp.gov.br/tecnologia-em-desenvolvimento-de-softwares-multiplataforma/">DSM- Desenvolvimento de software multiplataforma.</a> com o objetivo de demonstrar na prática dois dos princípios **SOLID**:

- **SRP (Single Responsibility Principle)** — Princípio da Responsabilidade Única  
- **LSP (Liskov Substitution Principle)** — Princípio da Substituição de Liskov  

Cada projeto apresenta **exemplos práticos de código incorreto e correto**, evidenciando o impacto de seguir (ou violar) esses princípios na manutenibilidade e clareza do software.

<h3 align="center">✅ Concluído ✅</h3>

---

## 📘 Estrutura do Repositório

```
solid-seminario/
 ├──LSP/
 |     └── src/
 |         ├── Forma.java
 |         ├── Retangulo.java
 |         ├── Quadrado.java
 |         ├── ViolacaoLSP.java
 |         └── Main.java
 ├──SRP/
 │    └──  src/
 │        ├── Main.java
 │        ├── errado/
 │        │    └── OrderServiceErrado.java
 │        └── correto/
 │             ├── OrderService.java
 │             ├── OrderRepository.java
 │             └── EmailService.java
 │    
 │
 └── 
      
```

---

# ⚙️ Projeto 1 — SRP (Single Responsibility Principle)

## 📘 Sobre o Projeto

O projeto **SRP** demonstra o **Princípio da Responsabilidade Única**, que afirma que uma classe deve ter **apenas uma razão para mudar**.

São apresentados dois exemplos:

1. ❌ **Código errado (violando SRP)** — uma única classe realiza múltiplas tarefas.  
2. ✅ **Código correto (aplicando SRP)** — cada classe possui uma responsabilidade específica (`OrderService`, `OrderRepository`, `EmailService`).

---

## 🎯 Objetivos de Aprendizagem

- Aplicar e compreender o **SRP**.  
- Reduzir o acoplamento e aumentar a coesão.  
- Praticar boas práticas de design e modularização.  

---

## ▶️ Como Executar

1. Acesse a pasta do projeto:
   ```bash
   cd SRP
   ```
2. Compile e execute a classe principal:
   ```bash
   javac src/Main.java
   java src/Main
   ```
3. Escolha no terminal:
   ```
   1 - Executar código ERRADO (violando SRP)
   2 - Executar código CORRETO (aplicando SRP)
   ```

### 🧩 Exemplo de Saída

**Código Errado:**
```
==> Executando código ERRADO:
Pedido criado: Pedido #1234 - Notebook Dell
Salvando pedido no banco de dados...
Enviando e-mail de confirmação...
Processamento completo (código errado).
```

**Código Correto:**
```
==> Executando código CORRETO:
Pedido salvo no banco de dados.
E-mail de confirmação enviado.
Pedido criado com sucesso! (código correto)
```

---

## 🧠 Conceito

> “Uma classe deve ter apenas uma razão para mudar.”  
> — *Robert C. Martin (Uncle Bob)*

Aplicar SRP traz benefícios como:
- Melhor **organização do código**
- Maior **facilidade de manutenção**
- **Menos dependências** entre módulos  

---

# ⚙️ Projeto 2 — LSP (Liskov Substitution Principle)

## 📘 Sobre o Projeto

O **LSP** estabelece que **subclasses devem poder substituir suas superclasses sem alterar o comportamento esperado do programa**.  
Proposto por *Barbara Liskov (1987)*, este princípio é essencial para garantir **heranças seguras e comportamentos previsíveis**.

O projeto mostra:

- ❌ Um exemplo **mal implementado**, que **viola o LSP**.  
- ✅ Um exemplo **correto**, que **respeita o princípio**.

---

## 🎯 Objetivos de Aprendizagem

- Entender o conceito de **substituibilidade**.  
- Reconhecer e corrigir violações do LSP.  
- Praticar o uso de **interfaces e herança adequada**.  

---

## ▶️ Como Executar

1. Acesse a pasta do projeto:
   ```bash
   cd LSP
   ```
2. Compile e execute:
   ```bash
   javac src/Main.java
   java src/Main
   ```
3. Escolha no console:
   ```
   === Demonstração do Princípio da Substituição de Liskov (LSP) ===
   1 - Exemplo ERRADO (violando o LSP)
   2 - Exemplo CORRETO (respeitando o LSP)
   Escolha uma opção:
   ```

### 🔹 Exemplo ERRADO
```
Área esperada: 50 | Área obtida: 100
```

### 🔹 Exemplo CORRETO
```
Retângulo [largura=5, altura=10] → Área: 50
Quadrado [lado=5] → Área: 25
```

---

## 🧠 Conceito

> “Se S é um subtipo de T, então objetos do tipo T podem ser substituídos por objetos do tipo S sem alterar o comportamento do programa.”

Benefícios:
- 🔒 **Segurança de comportamento**  
- 🔄 **Reutilização de código**  
- 🧩 **Extensibilidade**  
- 🧼 **Manutenção e clareza**

---

# 📚 Referências

- Martin, Robert C. *Clean Code* (2008)  
- Martin, Robert C. *Agile Software Development: Principles, Patterns, and Practices* (2002)  
- Liskov, Barbara; Wing, Jeannette. *A Behavioral Notion of Subtyping* (1994)  
- Fowler, Martin. *Refactoring: Improving the Design of Existing Code* (2019)  
- Sommerville, Ian. *Engenharia de Software* (2019)  
- [Refactoring.Guru – Liskov Substitution Principle](https://refactoring.guru/pt-br/design-principles/liskov-substitution-principle)  
- [Baeldung – SOLID Principles](https://www.baeldung.com/solid-principles)  
- [GeeksforGeeks – SRP](https://www.geeksforgeeks.org/single-responsibility-principle-solid/)  



---

# 🏁 Licença

Este projeto é de uso **acadêmico** e pode ser utilizado livremente para **fins educacionais**.
