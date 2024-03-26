package org.math.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MathCalculator {
    public static void main(String[] args) {
        MathOperations add = (a, b) -> a + b;
        MathOperations sub = (a, b) -> a - b;
        MathOperations mul = (a, b) -> a * b;
        MathOperations div = (a, b) -> a / b;

        displayResult("Addition", add, 8, 5);
        displayResult("Subtraction", sub, 20, 5);
        displayResult("Multiplication", mul, 10, 4);
        displayResult("Division", div, 18, 3);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(40);

        System.out.println("\nIterating through number playlist and printing only even numbers:");

        numbers.stream().forEach(n -> System.out.println("Value: " + n));

        Function<Integer, Double> doubleFunction = Integer::doubleValue;
        numbers.forEach(n -> {
            System.out.println("Double Value::" + doubleFunction.apply(n));
        });

        Predicate<Integer> isEvenFunction = n -> n % 2 == 0;
        numbers.forEach(n -> {
            System.out.println("Value: " + n + " Check for Even: " + isEvenFunction.test(n));
        });
    }

    private static void displayResult(String operation, MathOperations M, int a, int b)
    {
        System.out.println(operation + " is : " + M.calculate(a, b));
    }

}

