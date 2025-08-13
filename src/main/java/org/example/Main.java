package org.example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add
                = (a, b) -> a + b;
        System.out.println(add.apply(3, 4));

        Consumer<String> sendWelcomeMail = mail ->
                System.out.println("MAILING " + mail);
        register("hany", sendWelcomeMail);

        Function<Integer, Integer> doubleNumber = multiplyBy(2);
        Function<Integer, Integer> tripleNumber = multiplyBy(3);
        System.out.println(doubleNumber.apply(4));
        System.out.println(tripleNumber.apply(4));
        System.out.println(multiplyBy(5).apply(6));

        Consumer<String> greet = (name) -> System.out.println("Hello, " + name);
        processUserInput(greet);

        greet.accept("Abdullah");

    }
    public static void register(String name, Consumer<String> callback) {
        callback.accept(name + "domain.com");
    }
    public static Function<Integer, Integer> multiplyBy(int x) {
        return y -> x * y;
    }
    public static void processUserInput(Consumer<String> callback) {
        final String name = "Omar";
        callback.accept(name);
    }
}