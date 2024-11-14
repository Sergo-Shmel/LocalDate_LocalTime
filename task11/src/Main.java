import java.time.LocalDate;

//Генерация случайной даты в диапазоне
//Задача: Реализуйте метод, который принимает две даты и генерирует случайную дату в этом диапазоне.
public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate next = LocalDate.of(2025, 1, 23);
        System.out.println(RandomDate.randomDate(today, next));
    }
}
