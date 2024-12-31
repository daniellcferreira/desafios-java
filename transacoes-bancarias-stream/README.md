# Registro de Transações com Stream

## Descrição
Este programa registra transações financeiras de uma conta bancária, atualizando o saldo com base em entradas de usuário. Ele utiliza uma lista para armazenar as transações realizadas e faz uso de streams para exibir os dados de maneira funcional. O saldo é atualizado de acordo com o tipo de transação:
- Depósito (D): Adiciona o valor ao saldo.
- Saque (S): Subtrai o valor do saldo.

O programa também valida as entradas, garantindo que valores de transação sejam positivos e que os tipos de transação sejam válidos.

## Entrada
As entradas do programa devem ser fornecidas na seguinte ordem:
1. **Saldo inicial da conta:** Um número decimal representando o saldo inicial.
2. **Quantidade de transações:** Um número inteiro representando o total de transações que serão registradas.
3. Para cada transação:
   - **Tipo de transação:** Um caractere (‘D’ para depósito ou ‘S’ para saque).
   - **Valor da transação:** Um número decimal positivo indicando o valor da transação.

### Exemplo de entrada
```
1000.00
3
D 500.00
S 200.00
D 300.00
```

## Saída
O programa exibe:
1. **Saldo final:** O saldo atualizado após o registro de todas as transações.
2. **Lista de transações:** Cada transação registrada no formato “[TIPO] de [VALOR]”.

### Exemplo de saída
```
Saldo final: R$ 1600.00
Transações registradas:
D de R$ 500.00
S de R$ 200.00
D de R$ 300.00
```

