import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

//Определение дня недели по дате
//Задача: Напишите метод, который принимает дату и возвращает название дня недели на русском языке.
public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(NameDayOfWeek.getDayOfWeekInRussian(today));
    }
}
