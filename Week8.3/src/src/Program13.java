package src;/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        double number;
        char operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        double number1 = sc.nextDouble();

        System.out.println("Enter second number");
        double number2 = sc.nextDouble();

        System.out.println("Enter the symbols +,/,-.*");
        char operator1 = sc.next().charAt(0);

        if (operator1=='+'){
            System.out.println("Addition of two numbers are:"+ (number1+number2));
                } else if (operator1=='-') {
            System.out.println("Subtraction of two numbers are:"+ (number1-number2));
        }else if (operator1=='*') {
            System.out.println("Multiplication of two numbers are:"+ (number1*number2));
        }else if (operator1=='/') {
            System.out.println("Division of two numbers are:"+ (number1/number2));
        }else {
            System.out.println("Operation will not perform");
        }

        }

    }
