# ☕ Mini Projetos Java

Uma coleção de projetos simples e educacionais em Java, desenvolvidos para praticar conceitos fundamentais de programação  e interação com o usuário.

## 📋 Sobre o Repositório

Este repositório contém mini projetos práticos que demonstram diferentes aspectos da programação Java, desde manipulação de dados básicos até interação com usuário e validações. Cada projeto é independente e focado em um conceito específico.

## 🗂️ Projetos Incluídos

### 🌡️ **Celsius to Fahrenheit Converter**
- **Descrição**: Conversor de temperatura entre Celsius e Fahrenheit
- **Funcionalidades**:
  - Conversão bidirecional (C → F e F → C)
  - Interface de console interativa
  - Validação de entrada numérica
  - Formatação de resultados com precisão decimal
- **Conceitos**: Operações matemáticas, formatação de saída, entrada do usuário

### 🔐 **Login System**
- **Descrição**: Sistema básico de autenticação de usuário
- **Funcionalidades**:
  - Cadastro de usuários
  - Autenticação com username/password
  - Validação de credenciais
  - Sistema de tentativas limitadas
  - Mensagens de feedback ao usuário
- **Conceitos**: Strings, validação, estruturas condicionais, arrays/collections

### 🎲 **Random Guess Game**
- **Descrição**: Jogo de adivinhação de números aleatórios
- **Funcionalidades**:
  - Geração de números aleatórios
  - Sistema de dicas (maior/menor)
  - Contador de tentativas
  - Níveis de dificuldade
  - Opção de jogar novamente
- **Conceitos**: Random class, loops, lógica condicional, validação de entrada

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 8+
- **IDE**: Qualquer IDE Java (IntelliJ IDEA, Eclipse, VS Code)
- **Bibliotecas**:
  - `java.util.Scanner` - Entrada do usuário
  - `java.util.Random` - Números aleatórios
  - `java.text.DecimalFormat` - Formatação numérica
  - `java.util.ArrayList` - Estruturas de dados

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- IDE Java ou terminal com `javac` e `java`

### Passos para execução:

#### Via IDE:
1. Clone o repositório
2. Importe os projetos na sua IDE
3. Execute a classe principal de cada projeto

#### Via Terminal:
```bash
# Clonar repositório
git clone https://github.com/seuusuario/mini-projects-java.git
cd mini-projects-java

# Compilar um projeto específico
cd "Celsius to Fahrenheit/src"
javac *.java
java MainClass

# Exemplo para Login System
cd "../Login System/src"
javac *.java
java LoginMain

# Exemplo para Random Guess
cd "../Random Guess/src"
javac *.java
java GuessGame
```

## 🎯 Conceitos de Programação Demonstrados

### **Fundamentos Java:**
- ✅ Sintaxe básica e estrutura de classes
- ✅ Métodos estáticos e de instância
- ✅ Variáveis e tipos de dados
- ✅ Operadores aritméticos e lógicos

### **Controle de Fluxo:**
- ✅ Estruturas condicionais (if/else, switch)
- ✅ Loops (for, while, do-while)
- ✅ Break e continue

### **Entrada/Saída:**
- ✅ Scanner para entrada do usuário
- ✅ System.out para saída formatada
- ✅ Validação de entrada
- ✅ Tratamento de exceções básico

## 📚 Aprendizados e Objetivos

### **Habilidades Desenvolvidas:**
- **Lógica de Programação**: Resolução de problemas step-by-step
- **Java Fundamentals**: Sintaxe, OOP, bibliotecas padrão
- **User Experience**: Interfaces de console intuitivas
- **Validação de Dados**: Tratamento de entradas inválidas
- **Code Organization**: Estruturação de classes e métodos

### **Próximos Passos:**
- [ ] Adicionar interface gráfica (Swing/JavaFX)
- [ ] Implementar persistência de dados
- [ ] Criar testes unitários
- [ ] Adicionar logging
- [ ] Melhorar tratamento de exceções

## 🔧 Possíveis Melhorias

### **Conversor de Temperatura:**
- Adicionar mais escalas (Kelvin, Rankine)
- Interface gráfica
- Histórico de conversões

### **Sistema de Login:**
- Criptografia de senhas
- Níveis de usuário (admin/user)
- Persistência em arquivo/banco

### **Jogo de Adivinhação:**
- Ranking de melhores tempos
- Múltiplos níveis de dificuldade
- Interface gráfica com efeitos

---

**Linguagem**: Java  
**Nível**: Iniciante a Intermediário  
**Tempo estimado por projeto**: 30-60 minutos  
**IDE recomendada**: IntelliJ IDEA Community
