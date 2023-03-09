import java.util.function.Consumer;

/**
 * Создайте функциональный интерфейс Consumer,
 * который принимает на вход имя человека и выводит в консоль приветствие в его адрес.
 * Реализуйте его в двух вариантах: через анонимный класс и через лямбду.
 */

public class Task2 {

    public static void main(String[] args) {
        task1("Mike");// через анонимный класс
        task2("Tom");// через лямбду
    }

    public static void task1(String name) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello, " + s + "!");
            }
        };
        consumer.accept(name);
    }

    public static void task2(String name) {
        Consumer<String> consumer = s ->
                System.out.println("Hello, " + name + "!");
        consumer.accept(name);
    }
}
