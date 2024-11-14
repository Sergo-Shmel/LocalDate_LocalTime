import java.time.Year;

//Проверка високосного года
//Задача: Реализуйте метод, который принимает год и возвращает true,
// если он является високосным, и false в противном случае.
public class Main {
    public static void main(String[] args) {
        LeapYearCheking leapYearCheking = new LeapYearCheking();
        System.out.println(leapYearCheking.LeapYearCheking(Year.of(2024)));
    }
}
