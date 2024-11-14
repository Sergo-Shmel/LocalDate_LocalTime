import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

public class CountWorkHours {
    public static long countWorkHours(LocalDateTime start, LocalDateTime end) {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Начало рабочего дня должно быть раньше конца.");
        }

        long workingHours = 0;
        LocalDateTime currentDateTime = start;

        while (currentDateTime.isBefore(end)) {
            if (currentDateTime.getDayOfWeek() != DayOfWeek.SATURDAY && currentDateTime.getDayOfWeek() != DayOfWeek.SUNDAY) {

                LocalDateTime endOfWorkDay = currentDateTime.withHour(18).withMinute(0).withSecond(0).withNano(0);
                if (endOfWorkDay.isAfter(end)) {
                    endOfWorkDay = end;
                }

                workingHours += Duration.between(currentDateTime, endOfWorkDay).toHours();
            }

            currentDateTime = currentDateTime.plusDays(1).withHour(9).withMinute(0).withSecond(0).withNano(0);
        }

        return workingHours;
    }

}
