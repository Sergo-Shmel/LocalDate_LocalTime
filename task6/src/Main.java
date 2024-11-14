import java.util.Objects;

//Расчет времени выполнения метода
//Задача: Реализуйте метод, который измеряет время выполнения другого метода
// (например, цикла из 1 миллиона итераций).
public class Main {
    public static void main(String[] args) {

        long executionTime = Count.measureExecutionTime(Objects.requireNonNull(Test::performTask));

        System.out.println("Время выполнения метода: " + executionTime + " мс");
    }
}
