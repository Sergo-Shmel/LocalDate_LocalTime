import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CountNewYear {
    public long CountNewYear() {
        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(today.getYear() + 1, 1, 1);

        long daysUntilNewYear = ChronoUnit.DAYS.between(today, newYear);

        return daysUntilNewYear;
    }
}
