package task.board.dto;

import java.util.List;

public record BoardDetailsDTO(Long id,
    String name,
    List<BoardColumnDTO> columns) {

}
