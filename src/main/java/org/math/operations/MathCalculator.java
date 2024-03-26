package org.math.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MathCalculator
{
    public static void main(String[] args)
    {
        MathOperations add = (a, b) -> a + b;
        MathOperations sub = new MathOperations()
        {
            @Override
            public int calculate(int a, int b)
            {
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
        numbers.add(25);
        numbers.add(40);

        System.out.println("\nIterating through number playlist and printing only even numbers:");
        numbers.forEach(MathCalculator::printEven);
    }

    private static void displayResult(String operation, MathOperations M, int a, int b)
    {
        System.out.println(operation + " is : " + M.calculate(a, b));
    }

    private static Predicate<Integer> isEven = n -> n % 2 == 0;
    private static void printEven(int number)
    {
        if (isEven.test(number))
        {
            System.out.println(number + " is an even number.");
        }
    }

    interface NumberConverter
    {
        double convert(int number);
    }

    private static double convertToDouble(int number)
    {
        NumberConverter converter = n -> n * 2.0;
        return converter.convert(number);
    }
}

