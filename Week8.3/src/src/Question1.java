package src;
/* Take 10 integers from keyboard using loop and print their average value on the
        screen. */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sum=0;
        int i;
        for (i = 0; i <= 10; i++)
        {
            System.out.println("Enter the numbers:" );
            sum=sum+ sc.nextInt();


        }
        double average = (double) sum/10;
        System.out.println("Average of 10 numbers are:" + average);

    }
}