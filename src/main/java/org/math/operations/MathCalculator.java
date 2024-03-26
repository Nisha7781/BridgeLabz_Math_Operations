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
        numbers.add(49);
        numbers.add(20);
        numbers.add(15);
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

        System.out.println("\nFinding the sum and average of numbers in the number stream:");
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        long count = numbers.size();
        if (sum.isPresent())
        {
            double average = (double) sum.get() / count;
            System.out.println("Sum: " + sum.get());
            System.out.println("Average: " + average);
        }
        else
        {
            System.out.println("No numbers found.");
        }

        System.out.println("\nFinding if all numbers or at least one number is even in the number stream:");

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        if (allEven)
        {
            System.out.println("All numbers are even.");
        }
        else
        {
            System.out.println("Not all numbers are even.");
        }

        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        if (anyEven)
        {
            System.out.println("At least one number is even.");
        }
        else
        {
            System.out.println("No numbers are even.");
        }
        
    }


    private static void displayResult(String operation, MathOperations M, int a, int b)
    {
        System.out.println(operation + " is : " + M.calculate(a, b));
    }

}
