import java.util.function.Function;

/**
 * Реализуйте функциональный интерфейс Function, который принимает на вход вещественное число типа Double,
 * а возвращает его округленный вариант типа Long.
 * Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
 */


public class Task3 {
    public static void main(String[] args) {
        task1(1235.823456); // через анонимный класс
        task2(123458.78524);// через лямбду
    }

    public static void task1(double number) {
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return (aDouble.longValue());
            }
        };
        System.out.println(function.apply(number));
    }

    public static void task2(double number) {
        Function<Double, Long> function = aDouble -> Math.round(number);
        System.out.println(function.apply(number));
    }
}
