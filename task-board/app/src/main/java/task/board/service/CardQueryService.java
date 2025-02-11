package task.board.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import lombok.AllArgsConstructor;
import task.board.dto.CardDetailsDTO;
import task.board.persistence.dao.CardDAO;

@AllArgsConstructor
public class CardQueryService {

  private final Connection connection;

  public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
    var dao = new CardDAO(connection);
    return dao.findById(id);
  }
}
