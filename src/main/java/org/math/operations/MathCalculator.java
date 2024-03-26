package org.math.operations;

public class MathCalculator
{

    public static void main(String[] args)
    {
        MathOperations add = (a,b) -> a+b;
        MathOperations sub = (a,b) -> a-b;
        MathOperations mul = (a,b) -> a*b;
        MathOperations div = (a,b) -> a/b;

        System.out.println("Addition is : " + add.calculate(8, 5));
        System.out.println("Subtraction is : " + sub.calculate(20, 5));
        System.out.println("Multiplication is : " + mul.calculate(10, 4));
        System.out.println("Division is : " + div.calculate(18, 3));    }

}