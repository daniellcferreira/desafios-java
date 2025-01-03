# HTTP Method Counter

## Descrição
Este programa identifica qual método HTTP é o mais frequente em uma lista fornecida pelo usuário. Ele também retorna a descrição do método identificado, quando disponível.

O programa funciona da seguinte forma:
1. Recebe uma entrada de métodos HTTP separados por vírgula.
2. Normaliza os métodos para maiúsculas e remove espaços extras.
3. Conta as ocorrências de cada método.
4. Identifica o método mais frequente e retorna sua descrição.
5. Exibe uma mensagem apropriada se a entrada for inválida ou se não houver métodos HTTP na lista.

## Entrada
A entrada consiste em uma string contendo métodos HTTP separados por vírgula. Por exemplo:

```
GET, POST, GET, DELETE, PUT, GET
```

- Espaços antes e depois de cada método são ignorados.
- A entrada é case-insensitive, ou seja, "get" e "GET" serão tratados como o mesmo método.

## Saída
A saída é uma mensagem informando o método HTTP mais frequente, sua contagem e uma descrição, quando disponível. Exemplos:

### Entrada válida
Para a entrada:
```
GET, POST, GET, DELETE, PUT, GET
```
Saída:
```
GET: 3 - O GET solicita a representação de um recurso.
```

### Entrada inválida
Para a entrada:
```
   
```
Saída:
```
Entrada inválida. Forneça uma lista de métodos HTTP separados por vírgula.
```

### Nenhum método encontrado
Para a entrada:
```
123, ABC, XYZ
```
Saída:
```
Nenhum método HTTP encontrado na entrada.
```


