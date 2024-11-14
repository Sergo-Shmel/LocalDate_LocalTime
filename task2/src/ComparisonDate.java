import java.time.LocalDate;

public class ComparisonDate {
    public ComparisonDate(LocalDate localDate,LocalDate localDate2) {
        if(localDate.isBefore(localDate2)) {
            System.out.println(localDate + " меньше второй даты " + localDate2);
        }else if (localDate.isAfter(localDate2)) {
            System.out.println(localDate + " больше второй даты " + localDate2);
        }else{
            System.out.println("Даты равны " + localDate);
        }
    }
}
