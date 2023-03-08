import java.util.function.Function;
import java.util.function.Predicate;


public class Task5 {
    /**
     * Напишите метод ternaryOperator, который из предиката и двух функций построит новую функцию,
     * возвращающую значение функции ifTrue , если предикат выполнен, а в остальных случаях — ifFalse
     */


    public static void main(String[] args) {

        ternaryOperator(-5);

    }

    public static void ternaryOperator(int number) {

        Predicate<Integer> isEven = n -> (n % 2 == 0);
        Function<Integer, String> ifEven = n -> "число четное";
        Function<Integer, String> ifOdd = n -> "число нечетное";
        System.out.println(isEven.test(number) ? ifEven.apply(number) : ifOdd.apply(number));
    }
}
