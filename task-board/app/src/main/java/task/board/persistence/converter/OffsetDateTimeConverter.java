package task.board.persistence.converter;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

import lombok.NoArgsConstructor;

import static java.time.ZoneOffset.UTC;
import static java.util.Objects.nonNull;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class OffsetDateTimeConverter {

  public static OffsetDateTime toOffsetDateTime(final Timestamp value) {
    return nonNull(value) ? OffsetDateTime.ofInstant(value.toInstant(), UTC) : null;
  }

  public static Timestamp toTimestamp(final OffsetDateTime value) {
    return nonNull(value) ? Timestamp.valueOf(value.atZoneSameInstant(UTC).toLocalDateTime()) : null;
  }

}
