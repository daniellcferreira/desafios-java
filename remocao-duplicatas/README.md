# Remover Duplicados

## Descrição
Este programa em Java remove elementos duplicados de uma lista de produtos fornecida pelo usuário, ignorando diferenças de maiúsculas e minúsculas, enquanto preserva a ordem de inserção. Ele utiliza um conjunto (`Set`) para identificar duplicados e uma lista (`List`) para manter os elementos únicos na ordem original.

## Entrada
1. Um número inteiro `n` que representa a quantidade de produtos a serem inseridos.
2. `n` linhas contendo os nomes dos produtos.

Exemplo:
```
5
Maçã
Banana
maçã
Laranja
Banana
```

## Saída
A lista de produtos únicos, na ordem em que foram inseridos pela primeira vez.

Exemplo:
```
Produtos únicos:
Maçã
Banana
Laranja
```

