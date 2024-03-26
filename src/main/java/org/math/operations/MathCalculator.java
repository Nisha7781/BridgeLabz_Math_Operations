package org.math.operations;

import java.util.ArrayList;
import java.util.List;

public class MathCalculator {

    public static void main(String[] args) {
        MathOperations add = (a, b) -> a + b;
        MathOperations sub = new MathOperations() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        MathOperations mul = (a, b) -> a * b;
        MathOperations div = (a, b) -> a / b;

        displayResult("Addition", add, 8, 5);
        displayResult("Subtraction", sub, 20, 5);
        displayResult("Multiplication", mul, 10, 4);
        displayResult("Division", div, 18, 3);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("\n Iterating through number play list using forEach:");
        numbers.forEach(System.out::println);
    }

    private static void displayResult(String operation, MathOperations M, int a, int b)
    {
        System.out.println(operation + " is : " + M.calculate(a, b));
    }
}

