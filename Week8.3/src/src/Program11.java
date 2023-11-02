package src;

import java.util.Scanner;

/* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.*/
public class Program11 {
    public static void main(String[] args) {
       // Character alphabet;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter alphabets A to F");
        Character alphabet = sc.next().charAt(0);

        if (alphabet =='A'){
            System.out.println("Ahmedabad");
        } else if (alphabet =='B') {
            System.out.println("Baroda");
        } else if (alphabet=='C') {
            System.out.println("chandigadh");
        } else if (alphabet == 'D') {
            System.out.println("Dahod");
        } else if (alphabet=='E') {
            System.out.println("Eli");
        } else if (alphabet=='F') {
            System.out.println("Fairy");
        }else {
            System.out.println("Invalid Input");
        }


    }

}
