import java.util.function.Function;
import java.util.function.Predicate;


public class Task5 {
    /**
     * Напишите метод ternaryOperator, который из предиката и двух функций построит новую функцию,
     * возвращающую значение функции ifTrue , если предикат выполнен, а в остальных случаях — ifFalse
     */


    public static void main(String[] args) {


        Predicate<Integer> isEven = n -> (n % 2 == 0);
        Function<Integer, String> ifEven = n -> "число четное";
        Function<Integer, String> ifOdd = n -> "число нечетное";
        Function<Integer, String> checkNumber = ternaryOperator(isEven, ifEven, ifOdd);
        System.out.println(checkNumber);

    }

    public static Function<Integer, String> ternaryOperator(Predicate<Integer> isEven,
                                                            Function<Integer, String> ifEven,
                                                            Function<Integer, String> ifOdd) {


        return n -> isEven.test(n) ? ifEven.apply(n) : ifOdd.apply(n);

    }
}
