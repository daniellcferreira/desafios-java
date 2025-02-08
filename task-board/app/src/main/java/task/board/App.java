package task.board;

import java.sql.SQLException;

import task.board.persistence.migration.MigrationStrategy;

import static task.board.persistence.config.ConnectionConfig.getConnection;

public class App {

  public static void main(String[] args) throws SQLException {
    try (var connection = getConnection()) {
      new MigrationStrategy(connection).executeMigration();
    }
  }

}
