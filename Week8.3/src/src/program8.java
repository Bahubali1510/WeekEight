package src;/*Write a java program to get numbers from users and print whether it is positive or negative.*/

import java.util.Scanner;

public class program8 {
    double number;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number");
        double number = sc.nextDouble();
        if (number<0){
            System.out.println("Number is negative");
        }
        else if (number > 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
