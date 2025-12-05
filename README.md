# SimpleBank 🏦  
### Um mini-sistema bancário desenvolvido para praticar os pilares da Orientação a Objetos em Java.

Este projeto começou como um exercício simples e evoluiu para um sistema bancário funcional.  
O objetivo foi sair de um código procedural e aplicar conceitos essenciais como **Herança**,  
**Polimorfismo**, **Encapsulamento** e **Tratamento de Exceções**, criando algo mais próximo de um software real.

Hoje o sistema permite criar, buscar e operar contas bancárias de tipos diferentes.

---

## 🚀 Funcionalidades

- **Menu interativo com validação de entrada** (programa não quebra com inputs inválidos)
- **Gerenciamento de contas:**
  - Criação com nome, saldo inicial e número da conta
  - Armazenamento dinâmico usando `ArrayList`
  - Busca por número para operações
- **Tipos de contas (Herança aplicada):**
  - Conta comum: saque, depósito e saldo
  - Conta poupança: possui todas as funções mais **aplicação de juros**
- **Operações financeiras com validação lógica**

---

## 🛠️ Conceitos e Tecnologias Usados

- **Java (JDK 8+)**
- **Orientação a Objetos:**
  - Modelagem com classes e objetos
  - Encapsulamento do saldo e acesso seguro via getters
  - `SavingAccount` estendendo `BankAccount`
  - Polimorfismo com `instanceof` para aplicar juros somente quando permitido
- **Coleções:** `ArrayList` para armazenar contas dinamicamente
- **Exceções:** Tratamento de erros digitados pelo usuário com `try / catch`

---

## 🧠 O que aprendi neste projeto

Este projeto solidificou vários conceitos-chave:

- Estruturar um sistema com múltiplas classes
- Criar hierarquias reutilizando código via herança
- Proteger informações do usuário e validar entradas
- Manipular listas de objetos em memória
- Evitar que erros do usuário interrompam a execução

---

## 🔮 Próximos Passos

Planejo evoluir o projeto com:

- [ ] Persistência (salvar e carregar contas)
- [ ] Transferência entre contas
- [ ] Remoção / encerramento de contas
- [ ] Interface gráfica

---

## 👨‍💻 Sobre mim

Sou estudante em desenvolvimento contínuo, focado em Java e Orientação a Objetos.  
Acredito que praticar construindo aplicações reais é a melhor forma de aprender — e este projeto representa um passo importante nessa jornada.
