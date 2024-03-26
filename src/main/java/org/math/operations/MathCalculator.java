package org.math.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Optional;

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
        numbers.add(19);
        numbers.add(20);
        numbers.add(25);
        numbers.add(40);

        System.out.println("\nFinding the minimum and maximum even numbers in the number stream:");

        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo);

        if (minEven.isPresent())
        {
            System.out.println("Minimum even number: " + minEven.get());
        }
        else
        {
            System.out.println("No even numbers found.");
        }

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);
        if (maxEven.isPresent())
        {
            System.out.println("Maximum even number: " + maxEven.get());
        }
        else
        {
            System.out.println("No even numbers found.");
        }
    }


    private static void displayResult(String operation, MathOperations M, int a, int b)
    {
        System.out.println(operation + " is : " + M.calculate(a, b));
    }

}
