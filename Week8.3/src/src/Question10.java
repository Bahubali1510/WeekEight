package src;/* Write a program to print the sum of two numbers entered by user by defining your
own method.*/

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        double num1, num2, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextDouble();
        System.out.println("Enter second number");
        num2 = sc.nextDouble();

        result = m1(num1, num2);
        System.out.println("The sum of " + num1 + " + " + num2 + " = " + result);
    }

    public static double m1(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
}
