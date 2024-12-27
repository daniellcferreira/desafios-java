# Simulador de Operações Bancárias em Java

## Descrição

Este é um programa simples em Java que simula operações bancárias básicas, permitindo ao usuário realizar depósitos, saques e consultar o saldo de uma conta bancária virtual.

## Funcionalidades

- **Depositar**: O usuário pode adicionar um valor à sua conta bancária, aumentando o saldo.
- **Sacar**: O usuário pode retirar um valor de sua conta, desde que haja saldo suficiente.
- **Consultar Saldo**: O saldo atual da conta pode ser consultado a qualquer momento.
- **Encerrar**: O programa é encerrado após o usuário selecionar essa opção.

## Funcionamento

Ao iniciar o programa, um menu será exibido com as seguintes opções:

1. **Depositar**
2. **Sacar**
3. **Consultar Saldo**
4. **Encerrar**

O usuário escolhe a opção digitando o número correspondente. Com base na escolha, o programa realiza a operação solicitada e exibe as mensagens apropriadas.

### Comportamento das Opções:

1. **Depositar**: O programa solicita um valor para depósito e atualiza o saldo. O saldo atual será exibido com uma casa decimal.
   - **Exemplo**: 
     - Entrada: 100.0
     - Saída: `Saldo atual: 100.0`

2. **Sacar**: O programa solicita um valor para saque e verifica se o saldo é suficiente. Se o saldo for suficiente, o valor é subtraído do saldo e a nova quantia é exibida. Se o saldo for insuficiente, o programa exibe uma mensagem informando a falta de fundos.
   - **Exemplo com saldo suficiente**: 
     - Entrada: 50.0
     - Saída: `Saldo atual: 50.0`
   - **Exemplo com saldo insuficiente**: 
     - Entrada: 200.0
     - Saída: `Saldo insuficiente.`

3. **Consultar Saldo**: O programa exibe o saldo atual da conta com uma casa decimal.
   - **Exemplo**: 
     - Saída: `Saldo atual: 50.0`

4. **Encerrar**: O programa exibe a mensagem "Programa encerrado." e termina a execução.
   - **Exemplo**: 
     - Saída: `Programa encerrado.`
