import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class RandomDate {
    public static LocalDate randomDate(LocalDate startDate, LocalDate endDate) {
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        Random random = new Random();
        long randomDays = random.nextLong(daysBetween + 1);

        return startDate.plusDays(randomDays);
    }
}
