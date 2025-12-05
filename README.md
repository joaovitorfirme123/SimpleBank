# SimpleBank 🏦
### Um sistema bancário robusto aplicando os pilares da Orientação a Objetos em Java.

Este projeto começou como um pequeno exercício de lógica e evoluiu para um sistema bancário completo. O objetivo foi refatorar um código procedural inicial para aplicar conceitos avançados de Java, como **Herança**, **Polimorfismo**, **Encapsulamento** e **Tratamento de Exceções**.

O sistema agora permite gerenciar múltiplos clientes e diferentes tipos de contas bancárias simultaneamente.

## 🚀 Funcionalidades

- **Menu Interativo e Seguro:** Navegação protegida contra erros de digitação (letras em campos numéricos não travam o sistema).
- **Gerenciamento de Contas:**
  - Criação dinâmica de contas (nome, depósito inicial e número da conta).
  - Suporte a infinitos clientes usando Listas (`ArrayList`).
  - Busca de contas pelo número para realizar operações.
- **Tipos de Contas (Herança):**
  - **Conta Comum:** Depósitos, saques e consulta de saldo.
  - **Conta Poupança:** Possui todas as funções da comum, mais a funcionalidade exclusiva de **Render Juros**.
- **Operações Financeiras:**
  - Depósitos e Saques com validação de saldo e valores positivos.
  - Formatação monetária adequada (`R$`).

## 🛠️ Tecnologias e Conceitos Aplicados

- **Java (JDK 8+)**
- **POO (Programação Orientada a Objetos):**
  - **Classes e Objetos:** Modelagem do sistema.
  - **Encapsulamento:** Proteção do saldo com `private` e `protected`, acesso via Getters.
  - **Herança:** Criação da `SavingAccount` herdando de `BankAccount`.
  - **Polimorfismo:** Uso de `instanceof` e *Casting* para aplicar juros apenas em contas poupança dentro de uma lista genérica.
- **Collections:** Uso de `ArrayList` para manipulação dinâmica de dados.
- **Tratamento de Exceções:** Uso de blocos `try-catch` para capturar `InputMismatchException` e limpar o buffer do `Scanner`.

## 🧠 O que aprendi neste projeto

Este projeto foi fundamental para solidificar meu conhecimento em Java. Saí do básico de métodos e loops para entender:
- Como estruturar um projeto real usando Classes e Objetos.
- A importância de proteger os dados do cliente (Encapsulamento).
- Como evitar que o programa feche ("crashe") quando o usuário digita algo errado.
- Como reaproveitar código criando classes filhas (Herança).
- A lógica de manipular listas de objetos em memória.

## 🔮 Próximos Passos

Apesar de funcional, o sistema sempre pode evoluir. Meus planos futuros incluem:
- [ ] Implementar a persistência de dados (salvar as contas em arquivo ou Banco de Dados).
- [ ] Adicionar funcionalidade de transferência entre contas.
- [ ] Criar uma opção para remover/encerrar contas.
- [ ] Desenvolver uma Interface Gráfica (GUI).

---

## 👨‍💻 Sobre mim

Sou estudante de programação focado em aprender Java na prática. Acredito que a melhor forma de fixar o conhecimento é construindo sistemas reais e enfrentando bugs de lógica. Este projeto representa um grande salto no meu aprendizado de Orientação a Objetos.
