import java.util.Random;
import java.util.function.Supplier;

/**
 * Напишите Supplier ,который возвращает случайное число из диапазона от 0 до 100.
 * Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
 */

public class Task4 {

    public static void main(String[] args) {

        task1(); // через анонимный класс
        task2();// через лямбду
    }

    public static void task1() {
        Random rnd = new Random();
        Supplier<Integer> supplier = new Supplier<Integer>() {
            int a;

            @Override
            public Integer get() {
                return a = rnd.nextInt(0, 101);
            }
        };
        System.out.println(supplier.get());
    }

    public static void task2() {
        Random rnd = new Random();
        Supplier<Integer> supplier = () -> (rnd.nextInt(1, 101));
        System.out.println(supplier.get());

    }
}
