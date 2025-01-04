# Gerenciador de Tabela

## Descrição

Este programa implementa uma classe chamada `Table` que permite gerenciar uma tabela de dados simples, onde cada entrada é composta por um identificador único (ID) e um nome.

Principais funcionalidades:

- **Inserir**: Adiciona novas entradas na tabela, validando a unicidade do ID.
- **Atualizar**: Permite modificar o nome de uma entrada existente com base no ID.
- **Remover**: Exclui uma entrada da tabela usando o ID.
- **Exibir**: Mostra todas as entradas da tabela no formato "ID: Nome".

O programa oferece um menu interativo para realizar essas operações.

## Entrada

O programa solicita ao usuário uma operação do menu e, dependendo da escolha, os seguintes dados podem ser requisitados:

1. Para inserir uma entrada:

   - Um inteiro representando o ID.
   - Uma string representando o Nome.

2. Para atualizar uma entrada:

   - O ID da entrada que será atualizada.
   - O novo Nome associado ao ID.

3. Para remover uma entrada:

   - O ID da entrada a ser removida.

4. Para exibir as entradas:

   - Nenhuma entrada adicional é necessária.

### Exemplo de Entrada

```
1
101
Alice
1
102
Bob
4
2
101
Alicia
4
3
102
4
5
```

## Saída

O programa exibe mensagens de confirmação ou erro para cada operação e lista as entradas atuais da tabela quando solicitado.

### Exemplo de Saída

```
Inserção realizada com sucesso.
Inserção realizada com sucesso.
Exibindo a tabela:
ID: 101, Nome: Alice
ID: 102, Nome: Bob
Atualização realizada com sucesso.
Exibindo a tabela:
ID: 101, Nome: Alicia
ID: 102, Nome: Bob
Remoção realizada com sucesso.
Exibindo a tabela:
ID: 101, Nome: Alicia
Encerrando o programa. Até mais!
```