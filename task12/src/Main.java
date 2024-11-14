import java.time.LocalDateTime;

//Расчет времени до заданной даты
//Задача: Создайте метод, который принимает дату и время события и рассчитывает,
// сколько часов, минут и секунд осталось до него от текущего момента.
public class Main {
    public static void main(String[] args) {
        System.out.println(Timer.timerEvent(
                LocalDateTime.of(2025, 1, 1, 0, 0, 0)));
    }
}
