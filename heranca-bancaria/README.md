# Desafio - Conta Poupança

## Descrição
Este programa simula o processo de criação e exibição de uma conta bancária, mais especificamente, uma conta poupança. O usuário é solicitado a fornecer dados como o nome do titular, número da conta, saldo inicial e taxa de juros. O programa, então, cria uma instância de uma conta poupança, exibindo as informações fornecidas, incluindo a taxa de juros.

O programa utiliza **Herança** como parte de seu design orientado a objetos. A classe `ContaPoupanca` herda da classe `ContaBancaria`, o que permite reutilizar e estender funcionalidades da conta bancária para incluir uma taxa de juros na conta poupança.

## Herança em POO
- **Classe `ContaBancaria`**: Esta é a classe base que contém os atributos e métodos gerais para uma conta bancária, como número da conta, titular e saldo. Ela também contém o método `exibirInformacoes` que exibe informações sobre a conta.
  
- **Classe `ContaPoupanca`**: Esta classe herda de `ContaBancaria` e adiciona um atributo específico de conta poupança: a **taxa de juros**. Ela sobrescreve o método `exibirInformacoes` para incluir a exibição da taxa de juros, além das informações básicas da conta bancária.


## Entrada
O programa solicita as seguintes informações ao usuário:
1. **Titular**: O nome do titular da conta.
2. **Número da Conta**: O número de identificação da conta.
3. **Saldo Inicial**: O valor de saldo inicial da conta.
4. **Taxa de Juros**: A taxa de juros aplicada à conta poupança.


## Saída
O programa exibe as seguintes informações:
1. **Titular**: O nome do titular da conta.
2. **Número da Conta**: O número da conta bancária.
3. **Saldo**: O saldo atual formatado.
4. **Taxa de Juros**: A taxa de juros aplicada à conta poupança.



