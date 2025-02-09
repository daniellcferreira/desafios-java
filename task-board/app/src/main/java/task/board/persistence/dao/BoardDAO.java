package task.board.persistence.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import com.mysql.cj.jdbc.StatementImpl;

import lombok.AllArgsConstructor;
import task.board.persistence.entity.BoardEntity;

@AllArgsConstructor
public class BoardDAO {

  private Connection connection;

  public BoardEntity insert(final BoardEntity entity) throws SQLException {
    var sql = "INSERT INTO BOARDS (name) values (?);";
    try (var statement = connection.prepareStatement(sql)) {
      statement.setString(1, entity.getName());
      statement.executeUpdate();
      if (statement instanceof StatementImpl impl) {
        entity.setId(impl.getLastInsertID());
      }
    }
    return entity;
  }

  public void delete(final Long id) throws SQLException {
    var sql = "DELETE FROM BOARDS WHERE id = ?;";
    try (var statement = connection.prepareStatement(sql)) {
      statement.setLong(1, id);
      statement.executeUpdate();
    }
  }

  public Optional<BoardEntity> findById(final Long id) throws SQLException {
    var sql = "SELECT id, name FROM BOARDS WHERE id = ?;";
    try (var statement = connection.prepareStatement(sql)) {
      statement.setLong(1, id);
      statement.executeQuery();
      var resultSet = statement.getResultSet();
      if (resultSet.next()) {
        var entity = new BoardEntity();
        entity.setId(resultSet.getLong("id"));
        entity.setName(resultSet.getString("name"));
        return Optional.of(entity);
      }
      return Optional.empty();
    }
  }

  public boolean exists(final Long id) throws SQLException {
    var sql = "SELECT 1 FROM BOARDS WHERE id = ?;";
    try (var statement = connection.prepareStatement(sql)) {
      statement.setLong(1, id);
      statement.executeQuery();
      return statement.getResultSet().next();
    }
  }

}
