package src;/*Write a Java program to sort a numeric array and a string array.*/

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        int[] numeric = {1,2,3,4,5};
        String[] array ={"Apple", "Banana" , "Orange", "Papaya", "Grapes"};

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any numeric or string");
        char string = sc.next().charAt(0);

        if (numeric instanceof int[]){
            System.out.println("This is numeric value" + numeric);
        }
        else if (array instanceof String[]){
            System.out.println("This is string array");
        }
        else{
            System.out.println("Enter valid input");
        }
    }
}
