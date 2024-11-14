import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//Задача: Напишите программу, которая:
//
//Создает объект LocalDate, представляющий текущую дату.
//Создает объект LocalTime, представляющий текущее время.
//Выводит их значения в формате dd-MM-yyyy HH:mm:ss
public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDateTime currentDateTime = LocalDateTime.of(today, now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Текущая дата и время: " + formattedDateTime);
    }
}
