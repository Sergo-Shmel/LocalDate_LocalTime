import java.time.LocalDate;
import java.util.Locale;

//14. Конвертация даты в строку с учетом локали
//Задача: Создайте метод, который принимает объект LocalDate и выводит его в
// строковом формате с учетом локали, например, ru или en.
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 10, 5);

        System.out.println(ConvertingDate.converting(date, new Locale("ru")));
        System.out.println(ConvertingDate.converting(date, new Locale("en")));
    }
}
