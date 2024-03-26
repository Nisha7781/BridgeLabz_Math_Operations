package org.math.operations;

import java.util.ArrayList;
import java.util.List;

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
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("\nIterating through number play list using forEach:");
        numbers.forEach(MathCalculator::printDouble);
    }

    private static void displayResult(String operation, MathOperations M, int a, int b)
    {
        System.out.println(operation + " is : " + M.calculate(a, b));
    }

    private static void printDouble(int number)
    {
        System.out.println("Double of " + number + " is: " + convertToDouble(number));
    }


    interface NumberConverter
    {
        double convert(int number);
    }

    private static double convertToDouble(int number)
    {
        NumberConverter converter = n -> n * 2.0; // Using lambda expression
        return converter.convert(number);
    }
}

