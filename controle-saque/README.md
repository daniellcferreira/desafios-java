# Controle Simples de Saques

## Descrição
Este programa em Java permite controlar saques bancários dentro de um limite diário especificado pelo usuário. O usuário informa o limite diário e pode realizar vários saques, desde que o total sacado não exceda esse limite. O programa também permite encerrar a transação ao inserir o valor `0`.

## Entrada
- **Limite diário**: Deve ser fornecido como um valor numérico de ponto flutuante.
- **Valor do saque**: Deve ser fornecido como um valor numérico de ponto flutuante.
  - O valor deve ser positivo e não pode exceder o saldo restante dentro do limite diário.
  - Um valor `0` encerra a transação.

## Saída
- Para cada saque válido:
  - **Mensagem**: "Saque de R$ {valor} realizado com sucesso. Limite restante: R$ {saldoRestante}"
- Se o saque exceder o limite diário:
  - **Mensagem**: "Saque excede o limite diário disponível. Limite restante: R$ {saldoRestante}"
- Se um valor negativo for inserido:
  - **Mensagem**: "Valor inválido. Insira um valor positivo."
- Se a entrada for inválida:
  - **Mensagem**: "Entrada inválida. Por favor, insira um número."
- Quando o usuário decide encerrar a transação (valor `0`):
  - **Mensagem**: "Transação encerrada."

