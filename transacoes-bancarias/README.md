# Registro de Transações Bancárias

## Descrição
Este programa permite registrar e gerenciar transações bancárias, como depósitos e saques, para uma conta. Ele calcula o saldo final após todas as transações e exibe um resumo das operações realizadas.

Principais funcionalidades:
- Registrar depósitos e saques.
- Validar entradas, como valores negativos e saldo insuficiente para saques.
- Exibir um resumo detalhado com o saldo final e todas as transações.

## Entrada
O programa requer as seguintes entradas:
1. **Saldo inicial da conta** (um valor decimal maior ou igual a zero).
2. **Quantidade de transações** (um número inteiro maior que zero).
3. Para cada transação:
   - **Tipo de transação**: “D” para depósito ou “S” para saque.
   - **Valor da transação**: um valor decimal maior que zero.

### Exemplo de Entrada:
```
100.00
3
D 50.00
S 30.00
D 20.00
```

## Saída
O programa exibe:
1. O **saldo final** após todas as transações.
2. Uma lista numerada de todas as transações realizadas, incluindo o tipo e o valor.

### Exemplo de Saída:
```
Resumo das transações:
Saldo final: 140.00
Lista de transações:
1. Depósito de 50.00
2. Saque de 30.00
3. Depósito de 20.00
```

