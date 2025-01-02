# Endpoint Validator

## Descrição
Este programa foi desenvolvido para validar endpoints seguindo um padrão predefinido. Ele utiliza expressões regulares para verificar se o endpoint segue o formato esperado. O objetivo é garantir que os endpoints estejam corretamente estruturados antes de serem utilizados em uma API.

### Regras para validação de endpoints:
- Um endpoint válido deve começar com `/api/`.
- Pode conter múltiplos segmentos separados por `/`.
- Nenhum segmento deve estar vazio.

Exemplo de endpoints válidos:
- `/api/users`
- `/api/products/details`

Exemplo de endpoints inválidos:
- `/api/`
- `/api//details`
- `api/users` (falta a barra inicial)

## Entrada
O programa solicita que o usuário insira um endpoint para validação. A entrada deve ser uma string representando o endpoint.

### Exemplo de entrada:
```
/api/users/details
```

## Saída
Dependendo da entrada fornecida, o programa exibirá uma mensagem indicando se o endpoint é válido ou inválido.

### Possíveis saídas:
1. Para um endpoint válido:
```
Endpoint válido.
```

2. Para um endpoint inválido:
```
Endpoint inválido: formato incorreto.
```

3. Para entradas nulas ou vazias:
```
Endpoint inválido: valor nulo ou vazio.
```

4. Em caso de erro na entrada:
```
Erro ao processar entrada: <mensagem do erro>
```

