//Конвертация между часовыми поясами
//Задача: Напишите метод, который принимает дату и время в часовом поясе UTC и
// конвертирует его в другой часовой пояс, например, Europe/Moscow.
public class Main {
    public static void main(String[] args) {
        String dateTimeString = "2023-10-05 T 12:30:00";

        String convertedDateTime = TransformTime.converting(dateTimeString, "UTC", "Europe/Moscow");

        System.out.println("Дата и время в Europe/Moscow: " + convertedDateTime);
    }
}
