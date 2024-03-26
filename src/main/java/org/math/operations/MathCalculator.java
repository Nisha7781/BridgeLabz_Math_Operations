package org.math.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MathCalculator
{
    public static void main(String[] args)
    {
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

        System.out.println("\nFiltering even numbers from the number stream and storing the result:");

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());



        System.out.println("Original list:");
        numbers.forEach(System.out::println);

        System.out.println("Updated list:");
        evenNumbers.forEach(System.out::println);
    }

    private static void displayResult(String operation, MathOperations M, int a, int b)
    {
        System.out.println(operation + " is : " + M.calculate(a, b));
    }

}
