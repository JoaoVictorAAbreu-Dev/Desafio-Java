# 🏦 Desafio Bancário - Java Console App

Sistema bancário simples via terminal, desenvolvido em Java. Permite consultar saldo, realizar Pix e receber valores através de um menu interativo.

---

## 📋 Funcionalidades

- **Consultar saldo** — Exibe o saldo atual da conta
- **Fazer Pix** — Transfere um valor, com validação de saldo suficiente
- **Receber valor** — Adiciona um valor ao saldo atual
- **Sair** — Encerra o programa

---

## 🚀 Como executar

### Pré-requisitos

- Java JDK 17 ou superior (para suporte a Text Blocks)

### Compilar e rodar

```bash
# Compilar
javac Desafio.java

# Executar
java Desafio
```

---

## 💻 Exemplo de uso

```
**************************

Nome do cliente: Jota
Tipo Conta: Corrente
Saldo atual: 1500.0

***************************
**Digite sua opcao**
1 - Consultar saldo
2 - Fazer pix
3 - Receber valor
4 - Sair
---------------------

> 2
Qual o valor do pix:
> 500
Saldo atual: 1000.0
```

---

## 🗂️ Estrutura do projeto

```
desafio-bancario/
└── Desafio.java   # Classe principal com toda a lógica
```

---

## 🛠️ Tecnologias

- **Java** — Linguagem principal
- **Scanner** — Leitura de entrada do usuário via terminal
- **Text Blocks** *(Java 15+)* — Usado para exibir o menu de forma legível

---

## ⚠️ Observações

- Os dados do cliente (nome, tipo de conta e saldo inicial) estão definidos diretamente no código.
- Não há persistência de dados — ao encerrar o programa, todas as alterações de saldo são perdidas.
- A opção `4` encerra o loop, mas por um pequeno bug lógico no `else if`, ela exibe "opcao invalida" antes de sair. Isso pode ser corrigido invertendo a condição de saída.

---

## 📌 Possíveis melhorias

- Adicionar persistência de dados (arquivo ou banco de dados)
- Suporte a múltiplos usuários
- Validação de entradas inválidas (letras no lugar de números)
- Extrato de transações
- Correção do bug na opção de saída
