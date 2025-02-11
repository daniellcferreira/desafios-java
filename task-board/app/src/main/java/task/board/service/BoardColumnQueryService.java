package task.board.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import lombok.AllArgsConstructor;
import task.board.persistence.dao.BoardColumnDAO;
import task.board.persistence.entity.BoardColumnEntity;

@AllArgsConstructor
public class BoardColumnQueryService {

  private final Connection connection;

  public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
    var dao = new BoardColumnDAO(connection);
    return dao.findById(id);
  }

}
