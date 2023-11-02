package src;

import java.util.Scanner;

/*Write a program that tells us input value is number or an alphabet or symbol.*/
public class Program15 {
    public static void main(String[] args) {
        String alphabets;
        double number;
        char symbols;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any input");
        String input = sc.next();

        System.out.println("Enter any numbers");
        double input1 = sc.nextDouble();



        // System.out.println( "Enter any symbols");
        // char symbols1 = sc.next().charAt(0);

        if (input1 >= 0 && input1 <= 9) {
            System.out.println("This is a number");
        } else if ((input.charAt(0) >= 'a' && input.charAt(0) <= 'z') || (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z')) {
            System.out.println("This is an alphabet");
        } else {
            System.out.println("This is a symbol");
        }
    }
}
