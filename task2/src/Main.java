import java.time.LocalDate;

//Сравнение дат
//Задача: Напишите метод, который принимает две даты (LocalDate) и определяет,
// какая из них больше, меньше или равна другой. Верните соответствующее сообщение.
public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024,11,14);
        ComparisonDate comparisonDate = new ComparisonDate(date1, date2);
    }
}
