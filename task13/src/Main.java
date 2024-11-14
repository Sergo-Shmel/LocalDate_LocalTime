import java.time.LocalDateTime;

//Вычисление количества рабочих часов
//Задача: Напишите метод, который принимает два объекта LocalDateTime,
// представляющие начало и конец рабочего дня, и возвращает количество рабочих часов (без учета выходных).
public class Main {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2023, 10, 2, 9, 0);
        LocalDateTime end = LocalDateTime.of(2023, 10, 6, 18, 0);
        System.out.println(CountWorkHours.countWorkHours(start, end));
    }
}
