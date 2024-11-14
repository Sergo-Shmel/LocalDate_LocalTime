import java.time.LocalDate;

//Вычисление возраста по дате рождения
//Задача: Напишите метод, который принимает дату рождения в формате LocalDate и
// возвращает текущий возраст в годах.
public class Main {
    public static void main(String[] args) {
        LocalDate day_of_birth = LocalDate.of(2005,3,3);
        System.out.println(ReturnAge.ageNow(day_of_birth));
    }
}
