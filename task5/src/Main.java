import java.time.Month;

//Подсчет выходных за месяц
//Задача: Напишите метод, который принимает месяц и год и
// возвращает количество выходных (суббот и воскресений) в этом месяце.
public class Main {
    public static void main(String[] args) {
        CountDayOff countDayOff = new CountDayOff();
        System.out.println(countDayOff.CountDayOff(2024, Month.of(11)));
    }
}
