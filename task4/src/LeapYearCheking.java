import java.time.Year;

public class LeapYearCheking {
    public boolean LeapYearCheking(Year year) {
        if (year.isLeap()) {
            return true;
        }
        return false;
    }
}
