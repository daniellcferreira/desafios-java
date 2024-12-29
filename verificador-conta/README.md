# Verificador de Número de Conta

## Descrição
Este programa é responsável por verificar a validade de um número de conta bancária. O número de conta deve conter exatamente 8 dígitos numéricos. Ele solicita que o usuário insira o número da conta, valida a entrada e exibe uma mensagem indicando se o número é válido ou não.

O programa também utiliza um loop para garantir que o usuário continue tentando até que insira um número válido, exibindo mensagens de erro em caso de entradas inválidas.

## Entrada
- O usuário deve fornecer um número de conta bancária.
- A entrada esperada é uma string contendo exatamente 8 dígitos numéricos (e.g., `12345678`).
- Entradas inválidas incluem:
  - Strings nulas ou vazias.
  - Strings com caracteres não numéricos.
  - Strings com mais ou menos de 8 dígitos.

## Saída
- Para entradas válidas: o programa exibe a mensagem `Número de conta válido.`
- Para entradas inválidas: o programa exibe uma mensagem de erro descritiva, como:
  - `Erro: Número de conta não pode estar vazio. Tente novamente.`
  - `Erro: Número de conta inválido. Deve conter exatamente 8 dígitos numéricos.`

O programa continuará solicitando a entrada até que o usuário forneça um número válido.

