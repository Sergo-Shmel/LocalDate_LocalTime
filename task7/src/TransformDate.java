import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransformDate {
    public TransformDate(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        localDate = localDate.plusDays(10);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDateTime = localDate.format(formatter2);

        System.out.println(formattedDateTime);
    }
}
