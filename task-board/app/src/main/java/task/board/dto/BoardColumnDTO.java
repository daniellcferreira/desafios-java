package task.board.dto;

import task.board.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
    String name,
    BoardColumnKindEnum kind,
    int cardsAmount) {
}
