# Consulta de Funcionários

## Descrição
Este programa em Java permite o cadastro e consulta de funcionários organizados por departamento. Os dados dos funcionários incluem nome, departamento e salário. Após o cadastro, o usuário pode consultar os funcionários de um determinado departamento.

## Entrada
1. O número de funcionários que serão cadastrados (um inteiro positivo).
2. Para cada funcionário:
   - Nome do funcionário (uma string).
   - Departamento do funcionário (uma string).
   - Salário do funcionário (um número decimal).
3. O nome do departamento para consulta.

### Exemplo de Entrada
```
3
João Silva
TI
5000.00
Maria Oliveira
RH
4500.50
Carlos Souza
TI
5500.75
TI
```

## Saída
A lista de funcionários do departamento consultado, com seus respectivos nomes e salários. Caso o departamento não tenha funcionários cadastrados, exibe uma mensagem informando isso.

### Exemplo de Saída
```
Funcionários do departamento TI:
Nome: João Silva - Salário: 5000.00
Nome: Carlos Souza - Salário: 5500.75
```

