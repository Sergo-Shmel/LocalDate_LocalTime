import java.time.Month;

//Создание календаря на месяц
//Задача: Напишите метод, который принимает месяц и год и выводит все даты месяца с указанием,
// является ли каждая из них рабочим днем или выходным.
public class Main {
    public static void main(String[] args) {
        Calendar.printCalendar(Month.DECEMBER,2024);
    }
}
