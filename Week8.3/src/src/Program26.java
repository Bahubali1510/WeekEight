package src;

import java.util.Scanner;

/*Write a Java program to reverse a word.*/
public class Program26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string is: dsaf");
        String string = sc.next();
        String reverse= "";
        for(int i=string.length()-1;i >= 0; i--){
            reverse += string.charAt(i);
        }
        System.out.println("Reverse string is:"+  reverse);

    }
}
