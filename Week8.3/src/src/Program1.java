package src;

import java.util.Scanner;

/*Write a java program that tells us that Input number is odd or even? HINT: use ternary
        operator (? :)*/
public class Program1 {
    double num1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        double num1 = sc.nextDouble();

        if (num1 % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}