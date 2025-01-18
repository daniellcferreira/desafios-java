# Filtro de Produtos

## Descrição
Este programa em Java permite filtrar uma lista de produtos com base em uma faixa de preços definida pelo usuário. O usuário informa a quantidade de produtos, seus detalhes (nome, categoria e preço) e os valores mínimo e máximo da faixa de preços. O programa exibe os produtos que atendem aos critérios de preço fornecidos.

## Entrada
- Número total de produtos a serem cadastrados.
- Para cada produto:
  - Nome (texto).
  - Categoria (texto).
  - Preço (número decimal).
- Valores mínimo e máximo da faixa de preços (números decimais).

## Saída
- Lista de produtos que possuem preço dentro da faixa especificada, exibidos no formato:
  ```
  Nome: <nome> - Categoria: <categoria> - Preço: <preço>
  ```
- Caso nenhum produto esteja na faixa, será exibida a mensagem:
  ```
  Nenhum produto encontrado nessa faixa de preço.
  ```

