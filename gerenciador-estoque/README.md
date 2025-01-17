# Gerenciador de Estoque

## Descrição
O **Gerenciador de Estoque** é um programa simples em Java que permite consultar a disponibilidade de produtos em estoque. O estoque inicial é configurado com uma lista fixa de itens e suas respectivas quantidades. O usuário pode inserir o nome do produto para verificar se ele está disponível e a quantidade em estoque.

## Entrada
- O programa solicita ao usuário que insira o nome do produto que deseja consultar.
- Comandos disponíveis:
  - Nome de um produto cadastrado (exemplo: "Switch", "Mouse", etc.).
  - Digite **sair** para encerrar o programa.

## Saída
- Mensagem indicando o status do produto:
  - "Produto disponível em estoque: [quantidade]" - se o produto for encontrado e estiver disponível.
  - "Produto indisponível em estoque" - se o produto estiver cadastrado mas esgotado.
  - "Produto não encontrado." - se o produto não for encontrado no estoque.
  - "Por favor, insira um nome válido para o produto." - se o usuário inserir um valor vazio ou inválido.

