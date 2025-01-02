# Cofre Digital e Físico

## Descrição
Este programa exemplifica o uso de abstração e encapsulamento em Java, por meio da implementação de um sistema que simula cofres digitais e físicos. Ele utiliza classes abstratas e concretas para modelar os diferentes tipos de cofres, destacando como propriedades e comportamentos podem ser organizados e protegidos dentro de uma hierarquia de classes.

### Principais conceitos abordados:
- **Abstração:** A classe `Cofre` define as características e comportamentos comuns a todos os tipos de cofres, enquanto as classes derivadas (`CofreDigital` e `CofreFisico`) especificam particularidades.
- **Encapsulamento:** Os atributos das classes estão protegidos e acessíveis apenas por meio de métodos, garantindo maior segurança e controle sobre os dados.

## Entrada
O programa solicita ao usuário os seguintes dados:
1. O tipo de cofre:
   - **"digital"**: Para selecionar um cofre digital.
   - **"fisico"**: Para selecionar um cofre físico.
2. Se o cofre for digital:
   - A senha do cofre (número inteiro).
   - Uma tentativa de confirmação da senha para abrir o cofre.

### Exemplo de entradas:
```
digital
1234
1234
```

```
fisico
```

## Saída
Dependendo da entrada fornecida, o programa exibirá informações sobre o cofre e, no caso de cofres digitais, indicará se a senha inserida está correta.

### Exemplo de saídas:
1. Para um cofre digital com senha correta:
```
Tipo: Cofre Digital
Método de abertura: Senha
Senha correta, cofre aberto!
```

2. Para um cofre digital com senha incorreta:
```
Tipo: Cofre Digital
Método de abertura: Senha
Senha incorreta!
```

3. Para um cofre físico:
```
Tipo: Cofre Físico
Método de abertura: Chave
```

4. Caso um tipo de cofre inválido seja inserido:
```
Tipo de cofre inválido
```

5. Caso uma entrada inválida seja fornecida:
```
Erro: entrada inválida. Por favor, tente novamente.
```

