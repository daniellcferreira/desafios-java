# Sudoku Game

## Descrição
Este projeto implementa um jogo de Sudoku em Java. O objetivo é fornecer uma experiência interativa onde os jogadores possam resolver quebra-cabeças de Sudoku gerados automaticamente. O jogo conta com funcionalidades para validar jogadas, verificar a conclusão do tabuleiro e garantir a conformidade com as regras clássicas do Sudoku. Além disso, a aplicação foi desenvolvida seguindo boas práticas de programação para facilitar futuras melhorias e manutenção.

## Funcionalidades
- Geração automática de tabuleiros de Sudoku.
- Interface baseada em terminal para interação do usuário.
- Validação de jogadas conforme as regras do Sudoku (sem repetição na linha, coluna e região 3x3).
- Exibição do tabuleiro atualizado a cada jogada.
- Indicação de erro ao inserir números inválidos.
- Mensagem de conclusão ao resolver o tabuleiro corretamente.

## Entrada
- O jogador insere os números manualmente para preencher as células vazias do tabuleiro.
- Os números devem estar no intervalo de 1 a 9 e respeitar as regras do jogo.
- O sistema solicita a posição (linha e coluna) e o número a ser inserido.

## Saída
- O tabuleiro atualizado após cada jogada.
- Mensagens informando se a jogada é válida ou inválida.
- Indicação de vitória quando todas as células forem preenchidas corretamente.
