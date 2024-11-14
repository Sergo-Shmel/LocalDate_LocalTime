import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class NameDayOfWeek {
    public static String getDayOfWeekInRussian(LocalDate date) {
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ru"));

        return dayOfWeek;

    }
}

