# Verificação de Cheque Especial

## Descrição
Este programa em Java é usado para verificar se é possível realizar um saque bancário considerando o saldo da conta e o limite do cheque especial. Ele solicita ao usuário o saldo da conta e o valor do saque, verificando se o saque pode ser realizado ou se excede os limites permitidos.

## Entrada
- **Saldo da conta**: Deve ser fornecido como um valor numérico de ponto flutuante.
- **Valor do saque**: Também deve ser fornecido como um valor numérico de ponto flutuante.

## Saída
- Se o saque é menor ou igual ao saldo da conta:
  - **Mensagem**: "Saque efetuado com sucesso!"
- Se o saque é maior que o saldo, mas menor ou igual ao saldo somado ao limite do cheque especial (500):
  - **Mensagem**: "Saque efetuado com sucesso! (Usando cheque especial)"
- Se o saque excede o saldo somado ao limite do cheque especial:
  - **Mensagem**: "Saldo insuficiente! Limite do cheque especial excedido."
- Se uma entrada inválida for fornecida:
  - **Mensagem**: "Entrada inválida para o saldo/saque. Por favor, insira um número."

