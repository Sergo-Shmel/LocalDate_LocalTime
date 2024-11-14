import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TransformTime {
    public static String converting(String dateTimeString, String fromZoneId, String toZoneId) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd' T 'HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

        ZonedDateTime fromZonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of(fromZoneId));

        ZonedDateTime toZonedDateTime = fromZonedDateTime.withZoneSameInstant(ZoneId.of(toZoneId));

        return toZonedDateTime.format(formatter);
    }
}
