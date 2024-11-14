import java.time.LocalDate;

public class ReturnAge {
    public static int ageNow(LocalDate date) {
        return LocalDate.now().getYear() - date.getYear();
    }
}
