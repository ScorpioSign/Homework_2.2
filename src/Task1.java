import java.util.function.Predicate;

/**
 * Напишите реализации функционального интерфейса Predicate, которые проверяют, является ли число положительным.
 * Если число положительное, то предикат должен возвращать true, в противном случае — false.
 * Реализуйте Predicate в двух вариантах:
 * через анонимный класс
 * через лямбду
 */
public class Task1 {
    public static void main(String[] args) {
        task1(); // реализация через анонимный класс
        task2(); // реализация через лямбду
    }

    public static void task1() {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if (n < 0) {
                    return false;
                }
                return true;
            }
        };
        System.out.println(predicate.test(25));

    }

    public static void task2() {
        Predicate<Integer> predicate = a -> (a > 0);
        System.out.println(predicate.test(-10));
    }
}

