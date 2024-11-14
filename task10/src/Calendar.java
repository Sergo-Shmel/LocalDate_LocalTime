import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar {
    public static void printCalendar(Month month, int year) {

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = firstDayOfMonth.plusMonths(1).minusDays(1);

        System.out.println("Календарь на " + month.getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + year);
        System.out.println("Пн Вт Ср Чт Пт Сб Вс");

            DayOfWeek firstDayOfWeek = firstDayOfMonth.getDayOfWeek();
            for (int i = 1; i < firstDayOfWeek.getValue(); i++) {
                System.out.print("   ");
            }

            for (LocalDate date = firstDayOfMonth; !date.isAfter(lastDayOfMonth); date = date.plusDays(1)) {
            System.out.printf("%2d", date.getDayOfMonth());


            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        if (lastDayOfMonth.getDayOfWeek() != DayOfWeek.SUNDAY) {
            System.out.println();
        }

    }
}
