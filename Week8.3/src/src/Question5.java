package src;

import java.util.Scanner;

/*Take two int values from user and print greatest among them.*/
public class Question5 {
    int num1;
    int num2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are equal");
        } else if (num1 > num2) {
            System.out.println("First number is greater");
        } else
        {
            System.out.println("Second number is greater");

        }
    }
}