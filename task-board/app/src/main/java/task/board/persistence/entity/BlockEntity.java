package task.board.persistence.entity;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class BlockEntity {

  private Long id;
  private OffsetDateTime blockedAt;
  private String blockReason;
  private OffsetDateTime unblockedAt;
  private String unblockReason;
}
