# Simulação Bancária

## Descrição

Este programa simula operações bancárias simples, permitindo que o usuário realize depósitos, saques e consulte o saldo de uma conta. O programa exibe um menu interativo onde o usuário pode escolher a operação desejada e visualizar as informações atualizadas após cada transação. O programa continuará em execução até que o usuário escolha encerrar a sessão.

## Entrada

O programa recebe as seguintes entradas do usuário:

1. Uma opção de operação bancária:
   - **1** para realizar um depósito.
   - **2** para realizar um saque.
   - **3** para consultar o saldo.
   - **0** para encerrar o programa.
   
2. Quando o usuário escolhe depositar ou sacar, o programa solicita um valor para a operação:
   - Para o depósito: um número positivo representando o valor a ser depositado.
   - Para o saque: um número positivo representando o valor a ser sacado.

## Saída

O programa exibe as seguintes saídas com base na interação do usuário:

- Mensagens de confirmação ou erro, dependendo da operação escolhida:
  - Após um depósito bem-sucedido: "Depósito realizado com sucesso. Saldo atual: [valor]."
  - Após um saque bem-sucedido: "Saque realizado com sucesso. Saldo atual: [valor]."
  - Se o saque for maior que o saldo disponível: "Saldo insuficiente. Operação não realizada."
  - Após a consulta do saldo: "Saldo atual: [valor]."
  - Caso o usuário escolha uma opção inválida: "Opção inválida. Tente novamente."
  - Ao encerrar o programa: "Programa encerrado."
