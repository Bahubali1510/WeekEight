package src;/* Take values of length and breadth of a rectangle from user and check if it is square or not.*/


import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        float len = sc.nextFloat();
        System.out.println("Enter the breath");
        float bre = sc.nextFloat();
        float square = len * bre;
        float rectangle = 2 * (len + bre);
        System.out.println("Area of square is :" + square);
        System.out.println("Area of rectangle is :" + rectangle);

        if(square>rectangle)
        {
            System.out.println("This is square");
        }
        else {
            System.out.println("This is rectangle");
        }

    }
}